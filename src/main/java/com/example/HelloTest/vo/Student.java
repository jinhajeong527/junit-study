package com.example.HelloTest.vo;

public class Student {
    private int id;
    private String stdName;
    private String stdAddress;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stdName='" + stdName + '\'' +
                ", stdAddress='" + stdAddress + '\'' +
                '}';
    }
}
