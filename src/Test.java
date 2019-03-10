import java.sql.SQLOutput;

public class Test {

    int foo(int i, double d){
        //形式参数，可以被认为是在方法中的变量
        System.out.println("foo" + i + d);
        return 1;//带返回值带方法必须写return
    }

    void goo() {
            System.out.println("foo");
            return; //可选
        }


    public static void main(String[] args) {
        Test t = new Test();
        //带返回值带方法可以被当作一个常量来使用
        int i = t.foo(1, 2 );
        t.foo(3, 3);
        //不带返回值带方法只能用于调用，即
        t.goo();

    }
}



