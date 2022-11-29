package br.com.gustavodinniz.service

import br.com.gustavodinniz.client.VehicleClient
import br.com.gustavodinniz.dto.request.SaleRequest
import jakarta.inject.Singleton

@Singleton
class SaleService(
    private val vehicleClient: VehicleClient
) {

    fun makeSale(saleRequest: SaleRequest) {
        val vehicle = vehicleClient.findById(saleRequest.vehicle);
        println(vehicle);
    }
}