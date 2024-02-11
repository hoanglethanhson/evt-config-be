package com.example.evtconfigdemo.entity;

import com.google.gson.Gson;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "config")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Config {
    //define id and value
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "value")
    private String value;
    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;
    @Column(name = "updated_date")
    @UpdateTimestamp
    private Date updatedDate;

    //define toString method to return config object in json format using gson
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}


