package myClasses;

public class A {

    private B b = new B();

    public int printAandB() {
        System.out.println("Hi, this is A");
        // counting the number of method instances.
        for (int i = 0; i < 10; i++) {
            b.print();
        }
        return 0;
    }
}
