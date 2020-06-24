package com.example.school.interfaces;

import com.example.school.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface coursesdb extends JpaRepository<courses, Long> {

  /*  @Query("SELECT COURSES(*) FROM COURSES where studentid= :studentid ")
    String getUsersWithStudentid(@Param("studentid") int studentid);    */
}
