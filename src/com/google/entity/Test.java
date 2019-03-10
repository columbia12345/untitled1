package com.google.entity;


class Count {
    public int count;

    public Count() {
        count = 1;
    }

//每掉一个方法都会创造一个新的栈。传递参数实际上是传递参数值的拷贝
    //
}
public class Test {
    public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;
        for(int i=0;i<100;i++){
            increment(myCount,times);
        }

        System.out.println("count is " + myCount.count);
        System.out.println("times is " + times);

    }

    public static void increment(Count c, int times) {
        c.count++;
        times++;

    }
}
