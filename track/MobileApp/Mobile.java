package track.MobileApp;

class Password {
}

class Access {
}

class AppLock {

    void verify(Password p) {
        System.out.println("Password verified");
    }

    Access unlock() {
        Access a = new Access();

        System.out.println("App unlocked");

        return a;
    }
}

public class Mobile {

    public static void main(String[] args) {

        AppLock lock = new AppLock();

        Password p = new Password();

        lock.verify(p);

        Access a = lock.unlock();

        if (a != null) {
            System.out.println("Access granted");
        }
    }
}
