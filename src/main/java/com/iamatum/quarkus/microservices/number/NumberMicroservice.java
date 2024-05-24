package com.iamatum.quarkus.microservices.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number Microservice",
                description = "Generate isbn number",
                contact = @Contact(name = "Marcus", url = "https://x.com/BlackhallMarcus"),

                version = "1.0"),
        tags = {@Tag(name = "api", description = "Public APi"),
                @Tag(name = "numbers", description = "ISBN numbers")
        }
)
public class NumberMicroservice extends Application {
}
