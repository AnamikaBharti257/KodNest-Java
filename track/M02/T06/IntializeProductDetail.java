package track.M02.T06;

import java.util.Scanner;

class Student4 {

    String name;
    Double price;

    Student4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

public class IntializeProductDetail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();

        Student4 p = new Student4(name, price);
        p.display();

        sc.close();
    }
}
