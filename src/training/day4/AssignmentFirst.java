package training.day4;

import java.util.Scanner;

public class AssignmentFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter your name : ");
        String name = in.nextLine();

        System.out.println("Please enter your age : ");
        int age = in.nextInt();

        System.out.println("Please enter your roll number :");
        String roll = in.next();

        System.out.println("Enter marks in Science: ");
        float science = in.nextFloat();

        System.out.println("Enter marks in Maths: ");
        float maths = in.nextFloat();

        System.out.println("Enter marks in English: ");
        float english = in.nextFloat();

        System.out.println("Enter marks in Computer: ");
        float computer = in.nextFloat();

        float percentage = (science+maths+english+computer)/4;

        System.out.println("The percentage secured by "+ name+ " is " + percentage);



    }
}
