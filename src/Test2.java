public class Test2 {


    int foo(int i, double d) {
        System.out.println("foo" + i + d);
        return 1;
    }

    void goo() {
        System.out.println("foo");
        return;
    }



    public static void main(String[] args) {
        Test2 t = new Test2();
        int i = t.foo(1,2);
        t.foo(3, 3);
        t.goo();

    }
}




