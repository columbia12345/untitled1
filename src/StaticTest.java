public class StaticTest {

    public static int i;
    public int j;

    public static void s1(){
        StaticTest.s2();    //静态内容用类来调用
        StaticTest.i = 1;    //静态内容用类来调用

    }

    public static void s2(){};

    public void f1(){   //普通方法随便放
        this.f2();      //this只能放在非静态上，表示当前类的对象
        StaticTest.i = 1;
        this.j = 2;
        StaticTest.s1();
    }
    public void f2(){

    }

}
