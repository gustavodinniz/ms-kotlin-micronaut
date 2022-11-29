package br.com.gustavodinniz.service

import br.com.gustavodinniz.model.Vehicle
import br.com.gustavodinniz.repository.VehicleRepository
import jakarta.inject.Singleton

@Singleton
class VehicleService(
    private val vehicleRepository: VehicleRepository
) {

    fun create(vehicle: Vehicle): Vehicle {
        return vehicleRepository.save(vehicle);
    }

    fun findById(id: Long): Vehicle {
        return vehicleRepository.findById(id).get();
    }
}