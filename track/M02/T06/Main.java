package track.M02.T06;

import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {

        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {

        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        FoodOrder f = new FoodOrder(item);

        FoodOrder f2 = new FoodOrder(item, quantity);

        f.display();
        f2.display();

        scanner.close();
    }

}
