package com.algrince.dockertask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DatabaseReader implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) {
        readData();
    }

    void readData() {

        List<Task> dbEntries = taskRepository.findAll();

        for (Task entry : dbEntries) {
            System.out.println("Entry: " + entry);
        }

    }
}
