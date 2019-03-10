package tryagain;

public class Zi extends Fu {

    private String z;
    //建议：子类构造器里的参数要想办法给父类构造器一个值

    public Zi() {
        super();//子类构造器中如果没有用this（）来调本类的其余构造器救护自动被加入super；
        //这句话的意思是调用父类无参构造器super.（）必须出现在构造器的第一行
        System.out.println("zi: " + z);
    }


    public Zi(String z, String f) {
        this.z = z; //调用父类的一个带String参数的构造器
        System.out.println("zi: " + z);
    }

    @Override
    public String toString() {
        return "Zi{" +
                "z='" + z + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //new Zi();


    }
}
