package com.iqmsoft.springbootkotlin.repo

import com.iqmsoft.springbootkotlin.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepo : JpaRepository<Person, Long> {

    fun findByLastName(firstName: String): List<Person>
}