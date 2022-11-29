package br.com.gustavodinniz.repository

import br.com.gustavodinniz.model.Vehicle
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface VehicleRepository : JpaRepository<Vehicle, Long> {
}