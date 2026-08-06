package track.M02.T02;

public class Breakandcontinue {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                continue;
            }
            System.out.println(i);
            if (i == 9) {
                break;
            }
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
            System.out.println();
        }

    }
}
