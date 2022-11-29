package br.com.gustavodinniz.client

import br.com.gustavodinniz.dto.response.Vehicle
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client(id = "http://localhost:8080")
interface VehicleClient {

    @Get("/vehicles/{id}")
    fun findById(@PathVariable id: Long): Vehicle
}