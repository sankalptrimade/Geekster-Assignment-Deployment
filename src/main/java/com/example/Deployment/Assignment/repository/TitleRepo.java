package com.example.Deployment.Assignment.repository;

import com.example.Deployment.Assignment.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepo extends JpaRepository<Title, Integer> {
}
