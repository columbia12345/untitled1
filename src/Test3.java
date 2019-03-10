import java.util.Arrays;

public class Test3 {
    void foo(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            nums[i]++;   // 结果是2 3 4 改变了数组的内容，则结果一定改变
        nums = new int[]{2, 3, 4};  //结果是 【1， 2， 3】
        //nums的内容没有改变，只是这个变量现在引用了另一个新的数组
        //原始的123数组还是存在的，只是这个变量已经不再引用它了（可理解为改变了名字）
        System.out.println("in foo: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        int[] nums = {1, 2, 3};
        t.foo(nums);
//d
        System.out.println("in main: " + Arrays.toString(nums));
    }
}

