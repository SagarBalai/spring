package com.saggy.azure.demo

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {


    @GetMapping("owner")
    fun getOwner(): String {
        return "Sagar"
    }
    
     @GetMapping("/")
    fun getOwner(): String {
        return "Welcome Sagar, you are rockstart"
    }

    @GetMapping("info")
    fun getInfo(): String {
        return "Demo for azure vm"
    }

    @PostMapping
    fun sendPayload(): ResponseEntity<Any> {
        return ResponseEntity(HttpStatus.OK)
    }

    @PostMapping("/token")
    fun getToken(): TokenResponse {
        return TokenResponse()
    }
}

data class TokenResponse(
        @JsonProperty("access_token") val accessToken: String = "token",
        @JsonProperty("expires_in") val expiresIn: Long = 435567L,
        @JsonProperty("ext_expires_in") val extExpiresIn: Long = 4353L,
        @JsonProperty("token_type") val tokenType: String = "basic"
)
