package com.example.baseui.room

object DBRegistry {
    private val dataBases = ArrayList<BaseDB>()

    fun registerDB(db: BaseDB) {
        dataBases.add(db)
    }

    fun clearDB() {
        dataBases.forEach { db ->
            db.clear()
        }
    }
}