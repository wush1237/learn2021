package com.stu;

public class Teststu {
    public static void main(String[] args) {
        Stud[] students = {
                new Stud("Andy",100,80),
                new Stud("Cody",75,85),
                new Stud("Sandy",70,70),
                new Stud("Sam",50,70),
                new Stud("Vivi",30,20),
        };

        for (int i = 0; i < students.length; i++) {
            students[i].print();
        //    students[i].avg();
            students[i].level();
        }
    }
}
