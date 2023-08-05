package com.example.utils.model.entities

import jakarta.persistence.*

@Entity
class Salt() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private var id: Long? = null
    private var salt1: String? = null
    private var salt2: String? = null
    private var owner: String? = null

    constructor(
        salt1: String,
        salt2: String,
        owner: String
    ) : this() {
        this.salt1 = salt1
        this.salt2 = salt2
        this.owner = owner
    }

    fun getId() =
        id

    fun setId(id: Long){
        this.id = id
    }

    fun getSalt1() =
        salt1

    fun setSalt1(salt1: String){
        this.salt1 = salt1
    }

    fun getSalt2() =
        salt2

    fun setSalt2(salt2: String){
        this.salt2 = salt2
    }

    fun getOwner() =
        owner


    fun setOwner(owner: String){
        this.owner = owner
    }
}