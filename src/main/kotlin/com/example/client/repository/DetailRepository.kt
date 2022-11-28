package com.example.client.repository

import com.example.client.model.Detail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface DetailRepository:JpaRepository<Detail, Long> {
    fun findById(id: Long?): Detail?
}
