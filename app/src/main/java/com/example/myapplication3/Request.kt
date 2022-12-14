package com.example.myapplication3

data class Request(
    val base_code: String,
    val documentation: String,
    val provider: String,
    val rates: Currency,
    val result: String,
    val terms_of_use: String,
    val time_eol_unix: Int,
    val time_last_update_unix: Int,
    val time_last_update_utc: String,
    val time_next_update_unix: Int,
    val time_next_update_utc: String
)