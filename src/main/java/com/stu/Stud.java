package com.stu;

public class Stud {
    String name;
    int math;
    int english;



    public Stud(String name,int math,int english){
        this.name = name;
        this.math = math;
        this.english = english;
    }




    public void level(){
        int avg = ((math+english)/2/10);
        String a = Integer.toString(avg);
        if (a.startsWith("9")){
            System.out.println("\t" +"A");
        }else if (a.startsWith("8")){
            System.out.println("\t" +"B");
        }else if (a.startsWith("7")){
            System.out.println("\t" +"C");
        }else if (a.startsWith("6")){
            System.out.println("\t" +"D");
        }else {
            System.out.println("\t" +"F");
        }
    }


    public void print(){
        float average = (math+english)/2 ;
        System.out.print("Name:"+ name + "\t" + math + "\t" + english +"\t"+ average );
    }

    }

