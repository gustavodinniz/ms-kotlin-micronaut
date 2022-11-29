package br.com.gustavodinniz.controller

import br.com.gustavodinniz.dto.request.SaleRequest
import br.com.gustavodinniz.service.SaleService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/sales")
class SaleController(
    private val saleService: SaleService
) {

    @Post
    fun makeSale(@Body saleRequest: SaleRequest) {
        saleService.makeSale(saleRequest);
    }
}