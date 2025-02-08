package com.example.estateapp.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.estateapp.model.User;

import java.util.List;

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(User student);

    @Query("SELECT * from user_table WHERE id = :id")
   User getUser(int id);

    @Query("SELECT COUNT(*) FROM user_table WHERE email = :email")
    int isUserExists(String email);

    @Query("SELECT * from user_table ")
    List<User> getAllUsers();
}
