package demo;

abstract class AbstractClass {

    protected int i = 0;

    static final int f = 100;

    abstract void show(); // abstract method

    void display() {
        System.out.println("Non-abstract method");
    }
}

public class DemoAbstractClassExample extends AbstractClass {

    @Override
    void show() {
        System.out.println("This is show method of Abstract class");
    }

    public static void main(String[] args) {

        AbstractClass abstractClass = new DemoAbstractClassExample();

        abstractClass.show();

        abstractClass.display();

        abstractClass.i++;

        System.out.println(abstractClass.i);
    }
}
