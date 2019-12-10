package com.example.bdt
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BDDao {
    @Insert
    suspend fun insertBD(bd: BD)
    
    @Query("SELECT * FROM birthday")
    suspend fun gwtAllBD(): LiveData<List<BD>>

    @Query("SELECT * FROM birthday WHERE id=ID")
    suspend fun getABD(): BD
}