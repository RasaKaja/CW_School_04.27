package com.company;

public class StudentClass {
    String name;
    private String grade; // when we have 'private' and want to operate in other methods, we should create methods in this class
    int feesTotal;
    private int feesPaid = 0;

    void setGrade(String grade) {
        this.grade = grade;
    }

    void setFeesPaid(int fees){
        feesPaid += fees;
    }

    int getFeesPaid(){
        return feesPaid;
    }

}
