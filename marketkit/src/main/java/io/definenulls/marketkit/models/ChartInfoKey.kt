package io.definenulls.marketkit.models

data class ChartInfoKey(
    val coinUid: String,
    val currencyCode: String,
    val periodType: HsPeriodType
)
