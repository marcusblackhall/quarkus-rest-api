package com.iamatum.quarkus.microservices.number;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.util.Random;

@Path("/api/numbers")
@Tag(name = "Numbers rest endpoint")
public class NumberResource {

    @Inject
    private Logger logger;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
        description = "Generates a Isbnnumer",
            summary = "Returns an isbn 10 and 13 number"

    )
    public IsbnNumbers getIsbnNumbers(){
        IsbnNumbers isbnNumbers = new IsbnNumbers();
        isbnNumbers.generationDate = Instant.now();
        isbnNumbers.isbn10 = "10-" + new Random().nextInt(100_000);
        isbnNumbers.isbn13 = "13-" + new Random().nextInt(100_000_000);
        logger.info("numbers " + isbnNumbers);
        return isbnNumbers;
    }
}
