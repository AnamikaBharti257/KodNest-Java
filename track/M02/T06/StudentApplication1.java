package track.M02.T06;

class Student1 {

    String name;
    int age;
    double height;

    Student1(String name, int age, double height) {
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

public class StudentApplication1 {

    public static void main(String[] args) {
        Student1 s1 = new Student1("Anamika", 21, 5.3);
        s1.display();

    }
}
