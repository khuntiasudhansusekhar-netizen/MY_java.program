class Bank {
    double interest() {
        return 0;
    }
}

class SBI extends Bank {
    double interest() {
        return 7.0;
    }
}

class ICICI extends Bank {
    double interest() {
        return 8.0;
    }
}

class Axis extends Bank {
    double interest() {
        return 9.0;
    }
}

public class InterestB {
    public static void main(String args[]) {
        Bank b;

        b = new SBI();
        System.out.println("SBI rate of interest: " + b.interest() + "%");

        b = new ICICI();
        System.out.println("ICICI rate of interest: " + b.interest() + "%");

        b = new Axis();
        System.out.println("Axis rate of interest: " + b.interest() + "%");
    }
}
