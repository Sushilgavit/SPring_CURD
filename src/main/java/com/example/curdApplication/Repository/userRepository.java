package com.example.curdApplication.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curdApplication.entities.user;


@Repository
public interface userRepository  extends JpaRepository<user,Integer>{

}
