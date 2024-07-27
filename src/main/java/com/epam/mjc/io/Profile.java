package com.epam.mjc.io;

public class Profile {
    private String name;
    private int age;
    private String email;
    private long phone;

    public Profile(String name, int age, String email, long phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
