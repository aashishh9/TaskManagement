package com.taskmanagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taskmanagement.demo.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
