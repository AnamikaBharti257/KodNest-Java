package track.M02.T02;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Learning Day");
                break;
            case 2:
                System.out.println("Learning Day");
                break;
            case 3:
                System.out.println("Learning Day");
                break;
            case 4:
                System.out.println("Learning Day");
                break;
            case 5:
                System.out.println("Learning Day");
                break;
            case 6:
                System.out.println("Revise Day");
                break;
            case 7:
                System.out.println("Revise Day");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        sc.close();
    }
}
