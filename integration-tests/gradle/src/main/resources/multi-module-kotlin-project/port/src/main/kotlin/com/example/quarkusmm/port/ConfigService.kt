package com.example.quarkusmm.port

import org.eclipse.microprofile.config.inject.ConfigProperty

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ConfigService(
    @ConfigProperty(name = "quarkusmm.message", defaultValue = "Undefined") val message: String
) {
    fun getHeader(): String {
        return message
    }
}
