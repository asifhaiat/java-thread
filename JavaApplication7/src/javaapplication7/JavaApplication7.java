package javaapplication7;

public class JavaApplication7 {

    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }

}
