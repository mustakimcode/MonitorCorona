package com.haidev.monitorcorona.features.kasus.models

import com.google.gson.annotations.SerializedName


data class KasusModel(
    @SerializedName("attributes")
    val attributes: KasusAttributes
)

data class KasusAttributes(
    @SerializedName("FID")
    val fID: Int,
    @SerializedName("Kasus_Meni")
    val kasusMeni: Int,
    @SerializedName("Kasus_Posi")
    val kasusPosi: Int,
    @SerializedName("Kasus_Semb")
    val kasusSemb: Int,
    @SerializedName("Kode_Provi")
    val kodeProvi: Int,
    @SerializedName("Provinsi")
    val provinsi: String
)