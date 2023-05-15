package com.example.modul4intentex3java.modul;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String name;
    private int age;

    // Constructor, getters, and setters
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    void setAge() {
        this.age = age;
    }

    void setName() {
        this.name= name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    // Implement the Parcelable methods

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in); // Fix this line
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}