package com.example.quarkusmm

import com.example.quarkusmm.port.CustomerService
import com.example.quarkusmm.port.ConfigService
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @Inject
    lateinit var service: CustomerService

    @Inject
    lateinit var config: ConfigService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = config.getHeader() + ":" + service.getMessage()
}