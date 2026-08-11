package track.M02.T04;
// import java.util.*;

class Students {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class Student {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.roll = 12;
        s1.name = "Anamika";
        s1.height = 5.3;
        System.out.println("student roll:" + s1.roll);
        System.out.println("Student name: " + s1.name);
        System.out.println("Student height: " + s1.height);

        s1.run();
        s1.sleep();
    }
}
