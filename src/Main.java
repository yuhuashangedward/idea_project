import com.alibaba.demo.StaticTest;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);
    }
}
