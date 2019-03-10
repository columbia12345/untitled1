package tryagain;

public class Fu {
    private String f;

    public Fu() {
        System.out.println("zi: " + f);
    }

    public Fu(String f) {
        this.f = f;
        System.out.println("zi: " + f);
    }

    @Override
    public String toString() {
        return "Fu{" +
                "f='" + f + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //new Zi();


    }
}
