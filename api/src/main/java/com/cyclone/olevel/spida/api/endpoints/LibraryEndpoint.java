package com.cyclone.olevel.spida.api.endpoints;

import com.cyclone.olevel.spida.api.model.Library;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "libraryApi",
        version = "v1",
        resource = "library",
        namespace = @ApiNamespace(
                ownerDomain = "model.api.spida.olevel.cyclone.com",
                ownerName = "model.api.spida.olevel.cyclone.com",
                packagePath = ""
        )
)
public class LibraryEndpoint {

    private static final Logger logger = Logger.getLogger(LibraryEndpoint.class.getName());

    /**
     * This method gets the <code>Library</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Library</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getLibrary")
    public Library getLibrary(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getLibrary method");
        return null;
    }

    /**
     * This inserts a new <code>Library</code> object.
     *
     * @param library The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertLibrary")
    public Library insertLibrary(Library library) {
        // TODO: Implement this function
        logger.info("Calling insertLibrary method");
        return library;
    }
}