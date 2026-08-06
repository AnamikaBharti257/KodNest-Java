package track.M02.T02;

public class Nestedloop {

    public static void main(String[] args) {
        //     for (int i = 0; i <= 5; i++) {
        //         for (int j = 0; j <= 5; j++) {
        //             System.out.println(j);
        //         }
        //         System.out.println();
        //     }

        // //while nested
        //  int i = 1;
        //  while(i<=5){
        //     int j = 1;
        //     while(j<=5){
        //         System.out.println(j);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        //  }
        //do while nested
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(j);
                j++;
            } while (j <= 5);
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
