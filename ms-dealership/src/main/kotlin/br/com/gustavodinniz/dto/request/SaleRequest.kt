package br.com.gustavodinniz.dto.request

import java.math.BigDecimal

data class SaleRequest(
    val client: String,
    val vehicle: Long,
    val amount: BigDecimal,
    val numberOfInstallments: Int
)
