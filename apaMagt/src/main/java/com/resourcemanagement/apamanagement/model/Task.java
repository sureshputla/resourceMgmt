package com.resourcemanagement.apamanagement.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tasks")
public class Task implements Serializable {

    @Serial
    private static final long serialVersionUID = -4212487985528265926L;
    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "task_name", unique = true)
    private String taskName;

    public Task() {
    }

    public Task(TaskDTO taskDTO) {
        this.taskName = taskDTO.getTaskName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                '}';
    }
}
