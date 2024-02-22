package com.example.kiwontest

import retrofit2.http.GET
import retrofit2.http.Header

interface NaverAPI {

    //Static Map 요청된 URL 매개변수를 기반으로 웹 페이지에 표시할 수 있는 이미지로 지도를 반환
    @GET("map-static/v2/raster")

    fun staticMap(
        @Header("X-NCP-APIGW-API-KEY-ID") Id: String,
        @Header("X-NCP-APIGW-API-KEY") Secret: String
    )

    //Directions 5 사용자가 지정한 출발지/목적지 정보에 따라 경로 관련 정보를 제공 (경유지 5개까지)
    @GET("map-direction/v1/driving")

    fun directions5(
        @Header("X-NCP-APIGW-API-KEY-ID") Id: String,
        @Header("X-NCP-APIGW-API-KEY") Secret: String
    )

    //Directions 15 사용자가 지정한 출발지/목적지 정보에 따라 경로 관련 정보를 제공 (경유지 15개까지)
    @GET("map-direction-15/v1/driving")

    fun directions15(
        @Header("X-NCP-APIGW-API-KEY-ID") Id: String,
        @Header("X-NCP-APIGW-API-KEY") Secret: String
    )

    //Geocoding 주소의 텍스트를 입력받아 좌표를 포함한 상세정보들을 제공
    @GET("map-geocode/v2/geocode")

    fun geocoding(
        @Header("X-NCP-APIGW-API-KEY-ID") Id: String,
        @Header("X-NCP-APIGW-API-KEY") Secret: String
    )

    //Reverse Geocoding 좌표를 주소를 변환(coordsToAddr)
    @GET("map-reversegeocode/v2/gc")

    fun reversegc(
        @Header("X-NCP-APIGW-API-KEY-ID") Id: String,
        @Header("X-NCP-APIGW-API-KEY") Secret: String
    )
}