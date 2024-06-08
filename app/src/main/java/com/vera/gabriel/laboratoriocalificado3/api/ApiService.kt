package com.vera.gabriel.laboratoriocalificado3.api

import com.vera.gabriel.laboratoriocalificado3.model.TeacherResponse
import retrofit2.http.GET

interface ApiService {
    @GET("list/teacher-b")
    suspend fun getTeachers(): TeacherResponse
}
