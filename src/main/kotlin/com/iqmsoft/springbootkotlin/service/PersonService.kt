package com.iqmsoft.springbootkotlin.service

import com.iqmsoft.springbootkotlin.domain.Person
import com.iqmsoft.springbootkotlin.repo.PersonRepo
import org.springframework.stereotype.Service

interface PersonService {

    fun findAll(): List<Person>
    fun findByLastName(firstName: String): List<Person>
}

@Service
class PersonServiceImpl(val personRepo: PersonRepo) : PersonService {

    override fun findAll(): List<Person> {
        return personRepo.findAll()
    }

    override fun findByLastName(lastName: String): List<Person> {
        return personRepo.findByLastName(lastName)
    }
}