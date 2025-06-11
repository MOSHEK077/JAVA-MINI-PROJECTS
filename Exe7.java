//get the input for 5-subjects and check the condition if 35 is pass and check another condition to show the class details

import java.util.Scanner;

public class Exe7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Tamil:");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks in English:");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks in Mathematics:");
        int m3 = sc.nextInt();
        System.out.println("Enter the marks in Science:");
        int m4 = sc.nextInt();
        System.out.println("Enter the marks in Social Science:");
        int m5 = sc.nextInt();
        int tot = m1 + m2 + m3 + m4 + m5;
        double avg = tot / 5;
        String res, cls;
        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {
            res = "Pass";
        } else {
            res = "Fail";
        }
        if (avg >= 75 && avg <= 100 && res == "Pass") {
            cls = "First class";
        } else if (avg < 75 && avg > 55 && res == "Pass") {
            cls = "Second class";

        } else if (avg >= 35 && avg <= 55 && res == "Pass") {
            cls = "Third class";
        } else {
            cls = "Failed class";
        }

        System.out.println("---Total Subjects---");
        System.out.println("Marks in Tamil:" + m1);
        System.out.println("Marks in English:" + m2);
        System.out.println("Marks in Mathematics:" + m3);
        System.out.println("Marks in Science:" + m4);
        System.out.println("Marks in Social Science:" + m5);
        System.out.println();
        System.out.println("----Average Marks----");
        System.out.println("Average Marks:" + avg);

        System.out.println("-------------------");
        System.out.println("Result:" + res);
        System.out.println("Class:" + cls);
        System.out.println("-------------------");
    }

}
