package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
    Scanner scanner = new Scanner(System.in);
    Scanner intScan = new Scanner(System.in);

    ArrayList<StudentClass> students = new ArrayList<>();

    void viewAllStudents() {
        System.out.println("View all Students: ");
        for (StudentClass student : students) {
            System.out.println("Name: " + student.name);
        }
        System.out.println(" ");
    }

    void viewSingleStudent() {
        System.out.println("Viewing single student by index");
        System.out.println("Enter index of student you want to view: ");

        int index = intScan.nextInt();
        StudentClass student = students.get(index); // getting student on the particular index
        System.out.println("Name: " + student.name + " Fees paid: " + student.getFeesPaid());
    }

    void addStudent() {
        System.out.println("Add Student");
        System.out.println("Please provide the name of student");
        String name = scanner.nextLine();

        System.out.println("Please provide students grade");
        String grade = scanner.nextLine();

        // creating new student
        StudentClass student = new StudentClass();
        student.name = name;
        student.setGrade(grade); // because variable 'grade' is private we shout create setGrade method in StudentClass

        // Add new Student to ArrayList of students
        students.add(student);
    }

    void removeStudent() {
        System.out.println("Remove student with particular index.");
        System.out.println("Please input index of the student you want to remove");

        int index = intScan.nextInt();
        students.remove(index); // remove student from the list on the particular index

        System.out.println("Student removed successfully");
    }

    void updateStudentFees(){
        System.out.println("Update Students fees");

        // read student index to be up[dated from user
        System.out.println("Please provide student index you want to update fees");
        int index = intScan.nextInt();

        // read the amount to be added
        System.out.println("Please provide fee amount");
        int amount = intScan.nextInt();

        // find the particular student with index provided
        StudentClass student = students.get(index);

        // add fees to fees paid by student
        student.setFeesPaid(amount);

        System.out.println(amount + " added to students balance");
    }
}
