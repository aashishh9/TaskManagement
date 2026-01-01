package com.taskmanagement.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.taskmanagement.demo.entity.Task;
import com.taskmanagement.demo.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
