package Assignment2;

import java.util.ArrayList;

public class User {
        private String firstName;
        private String secondName;
        private static int id;
        private int age;
        private String gender;
        private String password;
        private ArrayList<Integer> dateOfBirth;

    public User(){};
    public User(String firstName, String secondName, int id, int age, String gender, String password, int dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.dateOfBirth.set(3, dateOfBirth);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(ArrayList<Integer> dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Integer> getDateOfBirth() {
        return dateOfBirth;
    }

    public void PrintInfo () {
        System.out.println(getFirstName() + " " + getSecondName());
        System.out.println(getAge() + " " + getDateOfBirth());
        System.out.println(getGender() + " " + getId());
        System.out.println(getPassword());
    }
}

