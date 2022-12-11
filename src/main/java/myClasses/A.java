package myClasses;

public class A {

    private B b = new B(); // field dep from A to B

    public int printA() {
        System.out.println("Hi, this is A");
        b.printB();
        return 0;
    }

    public int print(B b1, B b2) {
        b1.printB(); 
        b2.printB();
        return 1;
    }
}
