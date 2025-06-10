
// Mini calculator;
import java.util.*;
import java.lang.*;

public class Exe4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Simple Calculator using java---");
        System.out.println("Operations :");
        System.out.println();
        System.out.println("Addition --(Add) or ('+')---");
        System.out.println("Subtraction --(Sub) or ('-')---");
        System.out.println("Multiplication --(Mul) or ('*')---");
        System.out.println("Division --(Div) or ('/')---");
        System.out.println("Modulus --(Mod) or ('%')---");
        System.out.println();
        System.out.println("---------------------------");
        System.out.print("Enter the operation what you want to calculate:");
        String user_choice = sc.nextLine();
        int n1, n2, rlt;
        if (user_choice.equals("Add") || user_choice.equals("+")) {
            System.out.print("Enter the value of n1:");
            n1 = sc.nextInt();
            System.out.print("Enter the value of n2:");
            n2 = sc.nextInt();
            rlt = n1 + n2;
            System.out.println("Addition : " + rlt);
        } else if (user_choice.equals("Sub") || user_choice.equals("-")) {
            System.out.print("Enter the value of n1:");
            n1 = sc.nextInt();
            System.out.print("Enter the value of n2:");
            n2 = sc.nextInt();
            rlt = n1 - n2;
            System.out.println("Subtraction : " + rlt);

        } else if (user_choice.equals("Mul") || user_choice.equals("*")) {
            System.out.print("Enter the value of n1:");
            n1 = sc.nextInt();
            System.out.print("Enter the value of n2:");
            n2 = sc.nextInt();
            rlt = n1 * n2;
            System.out.println("Multiplication : " + rlt);

        } else if (user_choice.equals("Div") || user_choice.equals("/")) {
            System.out.print("Enter the value of n1:");
            n1 = sc.nextInt();
            System.out.print("Enter the value of n2:");
            n2 = sc.nextInt();
            rlt = n1 / n2;
            System.out.println("Division : " + rlt);

        } else if (user_choice.equals("Mod") || user_choice.equals("%")) {
            System.out.print("Enter the value of n1:");
            n1 = sc.nextInt();
            System.out.print("Enter the value of n2:");
            n2 = sc.nextInt();
            rlt = n1 % n2;
            System.out.println("Modulus : " + rlt);

        } else {
            System.out.println("Invalid input ! ,--kindly enter the given operations--");
        }

    }

}
