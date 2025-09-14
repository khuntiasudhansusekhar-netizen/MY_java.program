class Parent {
    void print() {
        System.out.println("This is parent class");
    }
}

class Child1 extends Parent {
    void print() {
        System.out.println("This is child1 class");
    }
}

class Child2 extends Parent {
    void print() {
        System.out.println("This is child2 class");
    }
}

public class TestPolly {
    public static void main(String[] args) {
        Parent p1;

        p1 = new Child1();   // initialize p1 with Child1 object
        p1.print();          // calls Child1's print()

        p1 = new Child2();   // reassign p1 with Child2 object
        p1.print();          // calls Child2's print()
    }
}
