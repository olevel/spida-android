package com.cyclone.olevel.spida.api.endpoints;

import com.cyclone.olevel.spida.api.model.Assignment;
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
        name = "assignmentApi",
        version = "v1",
        resource = "assignment",
        namespace = @ApiNamespace(
                ownerDomain = "model.api.spida.olevel.cyclone.com",
                ownerName = "model.api.spida.olevel.cyclone.com",
                packagePath = ""
        )
)
public class AssignmentEndpoint {

    private static final Logger logger = Logger.getLogger(AssignmentEndpoint.class.getName());

    private static final int DEFAULT_LIST_LIMIT = 20;

    static {
        // Typically you would register this inside an OfyServive wrapper. See: https://code.google.com/p/objectify-appengine/wiki/BestPractices
        ObjectifyService.register(Assignment.class);
    }

    /**
     * Returns the {@link Assignment} with the corresponding ID.
     *
     * @param mId the ID of the entity to be retrieved
     * @return the entity with the corresponding ID
     * @throws NotFoundException if there is no {@code Assignment} with the provided ID.
     */
    @ApiMethod(
            name = "get",
            path = "assignment/{mId}",
            httpMethod = ApiMethod.HttpMethod.GET)
    public Assignment get(@Named("mId") Long mId) throws NotFoundException {
        logger.info("Getting Assignment with ID: " + mId);
        Assignment assignment = ofy().load().type(Assignment.class).id(mId).now();
        if (assignment == null) {
            throw new NotFoundException("Could not find Assignment with ID: " + mId);
        }
        return assignment;
    }

    /**
     * Inserts a new {@code Assignment}.
     */
    @ApiMethod(
            name = "insert",
            path = "assignment",
            httpMethod = ApiMethod.HttpMethod.POST)
    public Assignment insert(Assignment assignment) {
        // Typically in a RESTful API a POST does not have a known ID (assuming the ID is used in the resource path).
        // You should validate that assignment.mId has not been set. If the ID type is not supported by the
        // Objectify ID generator, e.g. long or String, then you should generate the unique ID yourself prior to saving.
        //
        // If your client provides the ID then you should probably use PUT instead.
        ofy().save().entity(assignment).now();
        logger.info("Created Assignment.");

        return ofy().load().entity(assignment).now();
    }

    /**
     * Updates an existing {@code Assignment}.
     *
     * @param mId        the ID of the entity to be updated
     * @param assignment the desired state of the entity
     * @return the updated version of the entity
     * @throws NotFoundException if the {@code mId} does not correspond to an existing
     *                           {@code Assignment}
     */
    @ApiMethod(
            name = "update",
            path = "assignment/{mId}",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public Assignment update(@Named("mId") Long mId, Assignment assignment) throws NotFoundException {
        // TODO: You should validate your ID parameter against your resource's ID here.
        checkExists(mId);
        ofy().save().entity(assignment).now();
        logger.info("Updated Assignment: " + assignment);
        return ofy().load().entity(assignment).now();
    }

    /**
     * Deletes the specified {@code Assignment}.
     *
     * @param mId the ID of the entity to delete
     * @throws NotFoundException if the {@code mId} does not correspond to an existing
     *                           {@code Assignment}
     */
    @ApiMethod(
            name = "remove",
            path = "assignment/{mId}",
            httpMethod = ApiMethod.HttpMethod.DELETE)
    public void remove(@Named("mId") Long mId) throws NotFoundException {
        checkExists(mId);
        ofy().delete().type(Assignment.class).id(mId).now();
        logger.info("Deleted Assignment with ID: " + mId);
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
            path = "assignment",
            httpMethod = ApiMethod.HttpMethod.GET)
    public CollectionResponse<Assignment> list(@Nullable @Named("cursor") String cursor, @Nullable @Named("limit") Integer limit) {
        limit = limit == null ? DEFAULT_LIST_LIMIT : limit;
        Query<Assignment> query = ofy().load().type(Assignment.class).limit(limit);
        if (cursor != null) {
            query = query.startAt(Cursor.fromWebSafeString(cursor));
        }
        QueryResultIterator<Assignment> queryIterator = query.iterator();
        List<Assignment> assignmentList = new ArrayList<Assignment>(limit);
        while (queryIterator.hasNext()) {
            assignmentList.add(queryIterator.next());
        }
        return CollectionResponse.<Assignment>builder().setItems(assignmentList).setNextPageToken(queryIterator.getCursor().toWebSafeString()).build();
    }

    private void checkExists(Long mId) throws NotFoundException {
        try {
            ofy().load().type(Assignment.class).id(mId).safe();
        } catch (com.googlecode.objectify.NotFoundException e) {
            throw new NotFoundException("Could not find Assignment with ID: " + mId);
        }
    }
}