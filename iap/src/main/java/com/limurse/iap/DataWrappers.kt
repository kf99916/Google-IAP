package com.limurse.iap

import com.android.billingclient.api.AccountIdentifiers

class DataWrappers {

    data class ProductDetails(
        val title: String?,
        val description: String?,
        val offers: List<Offer>?
    )

    data class PurchaseInfo(
        val purchaseState: Int,
        val developerPayload: String,
        val isAcknowledged: Boolean,
        val isAutoRenewing: Boolean,
        val orderId: String?,
        val originalJson: String,
        val packageName: String,
        val purchaseTime: Long,
        val purchaseToken: String,
        val signature: String,
        val sku: String,
        val accountIdentifiers: AccountIdentifiers?
    )

    data class Offer(
        val id: String?,
        val token: String?,
        val tags: List<String>?,
        val pricingPhases: List<PricingPhase>
    )

    data class PricingPhase(
        val price: String?,
        val priceAmount: Double?,
        val priceCurrencyCode: String?,
        val billingCycleCount: Int?,
        val billingPeriod: String?,
        val recurrenceMode: Int?
    )
}