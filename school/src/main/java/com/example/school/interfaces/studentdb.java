package com.example.school.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.school.models.students;
import org.springframework.stereotype.Repository;

@Repository
public interface studentdb extends JpaRepository<students, Long> {
}
