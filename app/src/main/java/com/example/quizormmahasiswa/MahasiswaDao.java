package com.example.quizormmahasiswa;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MahasiswaDao {
    @Insert
    void insert(mahasiswa mahasiswa);

    @Update
    void update(mahasiswa mahasiswa);

    @Delete
    void delete(mahasiswa mahasiswa);

    @Query("SELECT * FROM mahasiswa")
    List<mahasiswa> getAllMahasiswa();

}
