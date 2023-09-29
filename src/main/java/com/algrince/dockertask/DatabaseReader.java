package com.algrince.dockertask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class DatabaseReader implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository;

    public int periodInSeconds = 15;

    @Override
    public void run(String... args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                readData();
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, periodInSeconds * 1000);

    }

    void readData() {

        List<Task> dbEntries = taskRepository.findAll();

        for (Task entry : dbEntries) {
            System.out.println("Entry: " + entry);
        }

    }
}
