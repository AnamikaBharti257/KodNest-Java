package track.BusApp;

class Money {
}

class Ticket {
}

class Conductor {

    void collect(Money m) {
        System.out.println("Money collected by conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();

        System.out.println("Ticket issued");

        return t;
    }
}

public class Passenger {

    public static void main(String[] args) {

        Conductor c = new Conductor();

        Money m = new Money();

        c.collect(m);

        Ticket t = c.give();

        if (t != null) {
            System.out.println("Ticket collected");
        }
    }
}
