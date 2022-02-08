package Assignment2;

import java.util.ArrayList;

public class Validator {

    private int dateOfBirth;

    public void CheckAge (int age) {
        if (age < 18) {
            System.out.println("Sorry, you are not able to see content on this web site");
            System.exit(0);
        }
    }

    public void CheckPassword(String password) {
        int upperLetterCounter = 0;
        int lowerLetterCounter = 0;
        int numberCounter = 0;
        int specialSymbolCounter = 0;

        if (password.length() < 8) {
            System.out.println("Your password must contain minimum 8 symbols");
            System.exit(0);
        } else {
            if (password.contains("@") || password.contains("$") || password.contains("!") || password.contains("^")) {
                specialSymbolCounter++;
            }
            for (int i = 0; i < password.length(); i++) {
                for (int j = 65; j <= 90; j++) {
                    if (password.charAt(i) == (char) j) {
                        upperLetterCounter++;
                    }
                }
                for (int k = 97; k <= 122; k++) {
                    if (password.charAt(i) == (char) k) {
                        lowerLetterCounter++;
                    }
                }
                for (int n = 48; n <= 57; n++) {
                    if (password.charAt(i) == (char) n) {
                        numberCounter++;
                    }
                }
            }
            if (specialSymbolCounter <= 0) {
                System.out.println("Your password must contain one of the following special symbols: @, $, !, ^");
                System.exit(0);
            }
            if (upperLetterCounter <= 0) {
                System.out.println("Your password must contain at least one capital letter");
                System.exit(0);
            }
            if (lowerLetterCounter <= 0) {
                System.out.println("Your password must contain at least one lowercase letter");
                System.exit(0);
            }
            if (numberCounter <= 0) {
                System.out.println("Your password must contain at least one number");
                System.exit(0);
            }
        }
    }

    public void checkDate (ArrayList<Integer> dateOfBirth) {
        int day = dateOfBirth.get(0);
        int month = dateOfBirth.get(1);
        int year = dateOfBirth.get(2);
        System.out.println(day + "/" + month + "/" + year);

        if (year > 0) {
            if (month <= 12 && month > 0) {
                if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        if (day > 0 && day < 30) {
                        }
                        else {
                            System.out.println("The date is not correct");
                        }
                    }
                    else if (day > 0 && day < 29) {
                    }
                    else {
                        System.out.println("The date is not correct");
                    }
                }
                else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 0 && day < 31) {
                    }
                    else {
                        System.out.println("The date is not correct");
                    }
                }
                else {
                    if (day > 0 && day < 32) {
                    }
                    else {
                        System.out.println("The date is not correct");
                    }
                }

            }
            else
                System.out.println("Date isn't correct");
        }
    }
}









