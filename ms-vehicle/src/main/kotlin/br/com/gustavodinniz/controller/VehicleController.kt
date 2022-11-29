package br.com.gustavodinniz.controller

import br.com.gustavodinniz.model.Vehicle
import br.com.gustavodinniz.service.VehicleService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post


@Controller("/vehicles")
class VehicleController(
    private val vehicleService: VehicleService
) {

    @Post
    fun create(@Body vehicle: Vehicle): HttpResponse<Vehicle> {
        return HttpResponse.created(vehicleService.create(vehicle));
    }

    @Get("/{id}")
    fun findById(@PathVariable id: Long): Vehicle {
        return vehicleService.findById(id);
    }
}