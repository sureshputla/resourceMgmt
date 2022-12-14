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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", nullable = false)
    private Integer id;

    @Column(name = "task_name", unique = true)
    private String taskName;

    @ManyToOne
    @JoinColumn(name = "representative_id")
    private Representative representative;

    @Column(name = "task_description")
    private String taskDescription;

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

    public Representative getRepresentative() {
        return representative;
    }

    public void setRepresentative(Representative representative) {
        this.representative = representative;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", representative=" + representative +
                ", taskDescription='" + taskDescription + '\'' +
                '}';
    }
}
