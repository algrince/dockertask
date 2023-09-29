package com.algrince.dockertask;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "current_tasks")
@NoArgsConstructor
public class Task {

    @Id
    @Column(name = "idcurrent_tasks")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "is_done")
    private boolean isDone;

    public String toString() {
        return String.format("%d %s %b", id, name, isDone);
    }
}
