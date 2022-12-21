package myClasses;

public class C {

    private int dummyValue = 0;
    private B b1 = new B(); // field dep from C to B
    private B b2 = new B(); // field dep from C to B

    public C(){
        System.out.println("Hi, this is C, dyn_field_dep(C->B)=2");
    }

    public int printC0() {
        System.out.println("Hi, this is printC0, dyn_method_dep(C->B)=0");
        return 0;
    }

    public int printC1() {
        System.out.println("Hi, this is printC1, dyn_method_dep(C->B)=1");
        b1.printB(); // method dep from C to B.printB()
        return 0;
    }

    public int printC2() {
        System.out.println("Hi, this is printC2, dyn_method_dep(C->B)=1");
        b2.printB(); // method dep from C to B.printB()
        return 0;
    }

    public int printC3() {
        System.out.println("Hi, this is printC3, dyn_method_dep(C->B)=2");
        b1.printB(); // method dep from C to B.printB()
        b2.printB(); // method dep from C to B.printB()
        return 0;
    }

    public int getDummyValue(){
        return this.dummyValue;
    }
}
