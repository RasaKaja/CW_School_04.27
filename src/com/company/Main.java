package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the class");

        // create an instance of classroom to have access to the non-static methods in the class
        ClassRoom cr = new ClassRoom();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        do{
            System.out.println("Please choose an activity: ");
            System.out.println("""
                    1. Add a Student
                    2. View All Students
                    3. View the Single Student
                    4. Remove the Student
                    5. Add fees to Student Balance
                    "quit" - for end Meniu.
                    """);

            userInput = scanner.nextLine();

            switch (userInput){
                case "quit":
                    System.out.println("Exiting Application.");
                    break;
                case "1" :
                    cr.addStudent();
                    break;
                case "2" :
                    cr.viewAllStudents();
                    break;
                case "3" :
                    cr.viewSingleStudent();
                    break;
                case "4" :
                    cr.removeStudent();
                    break;
                case "5" :
                    cr.updateStudentFees();
                    break;
                default:
                    System.out.println("Please provide a valid input.");
            }
        } while (!userInput.equalsIgnoreCase("quit"));
    }
}
