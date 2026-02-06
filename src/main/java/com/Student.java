package com.codecounty.Percentage;

public class Student {
    String name;
    double marksObtained;

    static String collegeName="LPU";
    static final int MAX_MARKS=100;

    public Student(String name, int marksObtained) {
        this.name = name;
        this.marksObtained = marksObtained;
    }


    public void printPercentage(){
        double Percentage=(marksObtained/MAX_MARKS)*100;
        System.out.println("Name: "+name+"\nCollege: "+collegeName+
                "\nMarks Obtained: "+marksObtained+"\nPercentage: "+String.format("%.2f",Percentage)+"%");
    }
}


