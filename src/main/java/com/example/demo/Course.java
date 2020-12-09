package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;
    private String title;
    private  String description;

    public Course(long id, String title, String description) {
        super();
        this.description = description;
        this.id = id;
        this.title = title;
    }

    public  Course() {
        super();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
