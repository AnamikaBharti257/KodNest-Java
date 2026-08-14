package track.MobileApp;

class TextPassword {
}

class Pattern {
}

class Face {
}

class Fingerprint {
}

class Voice {
}

class Access {
}

class AppLock {

    void verifyText(TextPassword t) {
        System.out.println("Text password verified");
    }

    void verifyPattern(Pattern p) {
        System.out.println("Pattern verified");
    }

    void verifyFace(Face f) {
        System.out.println("Face verified");
    }

    void verifyFingerprint(Fingerprint f) {
        System.out.println("Fingerprint verified");
    }

    void verifyVoice(Voice v) {
        System.out.println("Voice verified");
    }

    Access unlock() {

        Access a = new Access();

        System.out.println("Mobile unlocked");

        return a;
    }
}

public class Mobile {

    public static void main(String[] args) {

        AppLock lock = new AppLock();

        TextPassword text = new TextPassword();
        Pattern pattern = new Pattern();
        Face face = new Face();
        Fingerprint fingerprint = new Fingerprint();
        Voice voice = new Voice();

        lock.verifyText(text);
        lock.verifyPattern(pattern);
        lock.verifyFace(face);
        lock.verifyFingerprint(fingerprint);
        lock.verifyVoice(voice);

        Access a = lock.unlock();

        if (a != null) {
            System.out.println("Access granted");
        }
    }
}
