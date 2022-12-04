package com.example.HelloTest.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Student {
    @Id
    private int id;
    @Column
    private String stdName;
    @Column
    private String stdAddress;

    @Transient
    private int myValue;

    public Student() {
    }

    public Student(int id, String stdName, String stdAddress) {
        this.id = id;
        this.stdName = stdName;
        this.stdAddress = stdAddress;
    }

    public int getId() {
        return id;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stdName='" + stdName + '\'' +
                ", stdAddress='" + stdAddress + '\'' +
                '}';
    }
}
