package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KittynotesBackendApplication


fun main(args: Array<String>){
    runApplication<KittynotesBackendApplication>(*args)
}