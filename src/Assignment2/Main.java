package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User student = new User();
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your name: ");
        String name = scanner.next();
        student.setFirstName(name);

        System.out.print("Write your Second Name: ");
        String secondName = scanner.next();
        student.setSecondName(secondName);

        System.out.print("Write your ID: ");
        int id = scanner.nextInt();
        student.setId(id);

        System.out.print("write your age: ");
        int age = scanner.nextInt();
        student.setAge(age);
        validator.CheckAge(age);

        System.out.print("Write your gender: ");
        String gender = scanner.next();
        student.setGender(gender);

        System.out.print("Password: ");
        String password = scanner.next();
        student.setPassword(password);
        validator.CheckPassword(password);

        System.out.print("Birth date: ");
        ArrayList<Integer> dateOfBirth = new ArrayList<Integer>();
        for (int i = 1; i <= 3; i++) {
                int number = scanner.nextInt();
                dateOfBirth.add(number);
        }
        student.setDateOfBirth(dateOfBirth);
        validator.checkDate(student.getDateOfBirth());
    }
}
