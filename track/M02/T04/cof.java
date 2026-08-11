package track.M02.T04;

class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

public class cof {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 11;
        e1.name = "ashutosh";
        System.out.println("employee id is:" + e1.id);
        System.out.println("employee name is:" + e1.name);

        Employee e2 = e1;
        e2.id = 13;
        e2.name = "Anamika";
        System.out.println("employee id is:" + e1.id);
        System.out.println("employee name is:" + e1.name);
        System.out.println("employee id is:" + e2.id);
        System.out.println("employee name is:" + e2.name);
        e1.work();
    }
}
