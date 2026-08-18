
public class Homeworkone {

    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50};
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        double average = total / marks.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
