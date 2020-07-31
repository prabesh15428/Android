package com.example.myconta;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<Users> getAll();

    @Query("SELECT*FROM users WHERE id IN(:userIds)")
    List<Users> loadAllByIds(int[] userIds);

    @Query("SELECT* FROM users WHERE name LIKE:name AND "+" address LIKE :address LIMIT 1")
    Users findByName(String name, String address);

    @Insert
    void insertAll(Users... users);

    @Delete
    void delete(Users... users);

}
