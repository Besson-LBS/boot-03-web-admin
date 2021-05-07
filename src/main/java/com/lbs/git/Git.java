package com.lbs.git;


import javax.xml.crypto.Data;

public class Git {

    public static void main(String[] args) {
        System.out.println("git");
    }

    private String name;
    private int id;
    private Data data;

    @Override
    public String toString() {
        return "Git{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", data=" + data +
                '}';
    }

    public Git(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Git() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
