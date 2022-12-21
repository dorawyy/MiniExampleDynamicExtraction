package myClasses;

public class A {

    private B b = new B(); // field dep from A to B

    public int printA() {
        System.out.println("Hi, this is A");
        b.printB(); // method dep from A to B.printB(), where b is a field
        b.printB(); // method dep from A to B.printB(), where b is a field
        return 0;
    }

    public int print(B b1, B b2) {
        b1.printB(); // method dep from A to B.printB(), where b1 is a param
        b2.printB(); // method dep from A to B.printB(), where b2 is a param
        return 1;
    }
}
