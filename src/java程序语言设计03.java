public class java程序语言设计03 {
    public static void main(String[] args) {
     /*   //4
        Scanner in = new Scanner(System.in);
        System.out.println("y = ");
        int y = in.nextInt();
        if (y >= 0) {
            int x = 1;
            System.out.printf("x = %-3d",x);
        } else System.out.println("y < 0");*/


/*
        //5
        Scanner in = new Scanner(System.in);
        System.out.println("score = ");
        int score = in.nextInt();
        System.out.println("pay = ");
        int pay = in.nextInt();
        if (score > 90) {
            System.out.printf("The pay is %.2f", pay * (1 + 0.03));
        } else {
            System.out.printf("The pay is %.2f", pay);
        }
*/


/*
//6
        Scanner in = new Scanner(System.in);
        System.out.println("score = ");
        int score = in.nextInt();
        System.out.println("pay = ");
        int pay = in.nextInt();
        if (score > 90) {
            System.out.printf("The pay is %.2f", pay * (1 + 0.03));
        } else {
            System.out.printf("The pay is %.2f", pay * (1 + 0.01));
        }
*/


//7


//8   x = 3, y = 2 代码没输出。
//        z is 7
//        x is 2

//9
//        x is 2
//        没有输出
//        z is 6
//
//    12

/*        Scanner in = new Scanner(System.in);
        System.out.println("count = ");
        int count = in.nextInt();
        System.out.println(count % 10 == 0); */

//     var count = 10  ;
//     newLine = 20;
//        var newLine = count % 10 == 0 ? true : false;  ／／用三目运算是这样的

//16.


        //        System.out.printf("%-3d",(int)(Math.random()*20));
//        System.out.printf("%-3d", (int) (10 + Math.random() * 10));
//        System.out.printf("%-3d", (int) (Math.random() * 51));

//        System.out.printf("%-3d",(int)(Math.random())*2);


        //17. 一样

/*        //18.
        System.out.println((true)&&(3>4));
        int x = 1;
        System.out.println(!(x > 0) && (x > 0));
        System.out.println((x > 0) || (x < 0));
        System.out.println((x != 0) || (x == 0));
        System.out.println((x >= 0) || (x < 0));
        System.out.println((x != 0) || !(x == 0));*/

// 19
/*        Scanner in = new Scanner(System.in);
        System.out.println("num = ");
        int num = in.nextInt();
        System.out.println(num > 1 && num < 100);*/


/*        Scanner in = new Scanner(System.in);
        System.out.println("num = ");
        int num = in.nextInt();
        System.out.println(num > 1 && num < 100 || num < 0);*/


//20

/*        Scanner in = new Scanner(System.in);
        System.out.println("x = ");
        int x = in.nextInt();
        System.out.println(Math.abs(x - 5) < 4.5);
        System.out.println(Math.abs(x - 5) > 4.5);*/

/*//31
        int x = 3;
        int y = 3;
        switch (x + 3) {
            case 6:
                y = 1;
            default:
                y += 1;
        }
//这是啥*/


/*//31


int x =1; int a = 3;
switch(a){
    case 1:
        x+=5;
        break;
    case 2:
        x+=10;
        break;
    case 3:
        x+=16;
        break;
    case 4:
        x+=14;
        break;
    default:
        System.out.println("wrong");
        break;
        }

System.out.println("x is " + x);*/

/*//32.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer from 0 to 6 : ");
        int day = in.nextInt();
        String x = null;
        switch (day) {
            case 0:
                x = "Today is Sunday";
                break;
            case 1:
                x = "Today is Monday";
                break;
            case 2:
                x = "Today is Tuesday";
                break;
            case 3:
                x = "Today is Wednsday";
                break;
            case 4:
                x = "Today is Thursday";
                break;
            case 5:
                x = "Today is Froday";
                break;
            case 6:
                x = "Today is Saturday";
                break;
                
            default:
                System.out.println("wrong");
                break;
        }
        System.out.println("Today is " + x );
        */


        //35


    }
}
