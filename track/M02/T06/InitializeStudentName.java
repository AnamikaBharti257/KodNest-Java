package track.M02.T06;

import java.util.Scanner;

class Student2 {

    String name;

    Student2(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class InitializeStudentName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Student2 s1 = new Student2(name);
        s1.display();

        sc.close();
    }
}
