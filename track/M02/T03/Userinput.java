package track.M02.T03;

import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the byte value: ");
        // byte a = sc.nextByte();
        // System.out.println("byte value is: " + a);

        // System.out.println("Enter the short value: ");
        // short b = sc.nextShort();
        // System.out.println("short value is: " + b);

        // System.out.println("Enter the int value: ");
        // int c = sc.nextInt();
        // System.out.println("int value is: " + c);

        // System.out.println("Enter the long value: ");
        // long d = sc.nextLong();
        // System.out.println("long value is: " + d);
        //                                     .
        // System.out.println("Enter the float value: ");
        // float e = sc.nextFloat();
        // System.out.println("float value is: " + e);
        
        // System.out.println("Enter the double value: ");
        // double f = sc.nextDouble();
        // System.out.println("double value is: " + f);

        // System.out.println("Enter the boolean value: ");
        // boolean h = sc.nextBoolean();
        // System.out.println("boolean value is: " + h);
        // //nextline concept
        // System.out.print("Enter age: ");
        // int age = sc.nextInt();
        // System.out.println("age is: " + age);
        // sc.nextLine();

        // System.out.print("Enter name: ");
        // String name = sc.nextLine();
        // System.out.println("The name is: " + name);

        //char at
        System.out.println("Enter the char");
        char ch = sc.next().charAt(3);
        System.out.println("char is: " + ch);

        sc.close();

    }
}
