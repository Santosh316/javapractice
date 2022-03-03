package training.day5;

import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.Logger;

public class AssignmentSecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number");
        float i = in.nextFloat();

        System.out.println("Enter Second Number");
        float j = in.nextFloat();

        System.out.println("Enter Third Number");
        float k = in.nextFloat();

        if (i>j && i>k) {
            Logger.getGlobal().info(String.format("The greatest number is %8.2f ", i ));

        }
       else if (j>i && j>k){
            Logger.getGlobal().info(String.format("The greatest number is %8.2f", j));

        }
        else if (k>i && k>j){
            Logger.getGlobal().info(String.format("The greatest number is %8.2f", k));

        }
        else Logger.getGlobal().info(String.format("The numbers are equal"));

    }
}
