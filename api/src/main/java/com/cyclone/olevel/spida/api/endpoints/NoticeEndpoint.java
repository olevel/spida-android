package com.cyclone.olevel.spida.api.endpoints;

import com.cyclone.olevel.spida.api.model.Notice;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Nullable;
import javax.inject.Named;

import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * WARNING: This generated code is intended as a sample or starting point for using a
 * Google Cloud Endpoints RESTful API with an Objectify entity. It provides no data access
 * restrictions and no data validation.
 * <p/>
 * DO NOT deploy this code unchanged as part of a real application to real users.
 */
@Api(
        name = "noticeApi",
        version = "v1",
        resource = "notice",
        namespace = @ApiNamespace(
                ownerDomain = "model.api.spida.olevel.cyclone.com",
                ownerName = "model.api.spida.olevel.cyclone.com",
                packagePath = ""
        )
)
public class NoticeEndpoint {

    private static final Logger logger = Logger.getLogger(NoticeEndpoint.class.getName());

    private static final int DEFAULT_LIST_LIMIT = 20;

    static {
        // Typically you would register this inside an OfyServive wrapper. See: https://code.google.com/p/objectify-appengine/wiki/BestPractices
        ObjectifyService.register(Notice.class);
    }

    /**
     * Returns the {@link Notice} with the corresponding ID.
     *
     * @param mId the ID of the entity to be retrieved
     * @return the entity with the corresponding ID
     * @throws NotFoundException if there is no {@code Notice} with the provided ID.
     */
    @ApiMethod(
            name = "get",
            path = "notice/{mId}",
            httpMethod = ApiMethod.HttpMethod.GET)
    public Notice get(@Named("mId") Long mId) throws NotFoundException {
        logger.info("Getting Notice with ID: " + mId);
        Notice notice = ofy().load().type(Notice.class).id(mId).now();
        if (notice == null) {
            throw new NotFoundException("Could not find Notice with ID: " + mId);
        }
        return notice;
    }

    /**
     * Inserts a new {@code Notice}.
     */
    @ApiMethod(
            name = "insert",
            path = "notice",
            httpMethod = ApiMethod.HttpMethod.POST)
    public Notice insert(Notice notice) {
        // Typically in a RESTful API a POST does not have a known ID (assuming the ID is used in the resource path).
        // You should validate that notice.mId has not been set. If the ID type is not supported by the
        // Objectify ID generator, e.g. long or String, then you should generate the unique ID yourself prior to saving.
        //
        // If your client provides the ID then you should probably use PUT instead.
        ofy().save().entity(notice).now();
        logger.info("Created Notice.");

        return ofy().load().entity(notice).now();
    }

    /**
     * Updates an existing {@code Notice}.
     *
     * @param mId    the ID of the entity to be updated
     * @param notice the desired state of the entity
     * @return the updated version of the entity
     * @throws NotFoundException if the {@code mId} does not correspond to an existing
     *                           {@code Notice}
     */
    @ApiMethod(
            name = "update",
            path = "notice/{mId}",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public Notice update(@Named("mId") Long mId, Notice notice) throws NotFoundException {
        // TODO: You should validate your ID parameter against your resource's ID here.
        checkExists(mId);
        ofy().save().entity(notice).now();
        logger.info("Updated Notice: " + notice);
        return ofy().load().entity(notice).now();
    }

    /**
     * Deletes the specified {@code Notice}.
     *
     * @param mId the ID of the entity to delete
     * @throws NotFoundException if the {@code mId} does not correspond to an existing
     *                           {@code Notice}
     */
    @ApiMethod(
            name = "remove",
            path = "notice/{mId}",
            httpMethod = ApiMethod.HttpMethod.DELETE)
    public void remove(@Named("mId") Long mId) throws NotFoundException {
        checkExists(mId);
        ofy().delete().type(Notice.class).id(mId).now();
        logger.info("Deleted Notice with ID: " + mId);
    }

    /**
     * List all entities.
     *
     * @param cursor used for pagination to determine which page to return
     * @param limit  the maximum number of entries to return
     * @return a response that encapsulates the result list and the next page token/cursor
     */
    @ApiMethod(
            name = "list",
            path = "notice",
            httpMethod = ApiMethod.HttpMethod.GET)
    public CollectionResponse<Notice> list(@Nullable @Named("cursor") String cursor, @Nullable @Named("limit") Integer limit) {
        limit = limit == null ? DEFAULT_LIST_LIMIT : limit;
        Query<Notice> query = ofy().load().type(Notice.class).limit(limit);
        if (cursor != null) {
            query = query.startAt(Cursor.fromWebSafeString(cursor));
        }
        QueryResultIterator<Notice> queryIterator = query.iterator();
        List<Notice> noticeList = new ArrayList<Notice>(limit);
        while (queryIterator.hasNext()) {
            noticeList.add(queryIterator.next());
        }
        return CollectionResponse.<Notice>builder().setItems(noticeList).setNextPageToken(queryIterator.getCursor().toWebSafeString()).build();
    }

    private void checkExists(Long mId) throws NotFoundException {
        try {
            ofy().load().type(Notice.class).id(mId).safe();
        } catch (com.googlecode.objectify.NotFoundException e) {
            throw new NotFoundException("Could not find Notice with ID: " + mId);
        }
    }
}