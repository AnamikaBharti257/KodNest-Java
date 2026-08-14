package track.M02.T06;

class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("Anamika", 21, 5.3);
        s1.display();
    }
}
