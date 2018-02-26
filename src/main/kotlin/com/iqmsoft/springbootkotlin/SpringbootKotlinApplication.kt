package com.iqmsoft.springbootkotlin

import com.iqmsoft.springbootkotlin.domain.Person
import com.iqmsoft.springbootkotlin.repo.PersonRepo
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootKotlinApplication(val personRepo: PersonRepo) : CommandLineRunner {

    override fun run(vararg args: String?) {
        personRepo.save(Person("test", "test"))
        personRepo.save(Person("test1", "test1"))
        personRepo.save(Person("test2", "test2"))
        personRepo.save(Person("test3", "test4"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootKotlinApplication::class.java, *args)
}
