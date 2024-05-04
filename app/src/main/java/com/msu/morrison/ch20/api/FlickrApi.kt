package com.msu.morrison.ch20.api

import retrofit2.http.GET

private const val API_KEY = "4dee83bd8fbc5dba09b2672ae13fbf39"

interface FlickrApi {
    //@GET("/")

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
//    suspend fun fetchContents():String
    suspend fun fetchPhotos():FlickrResponse
}