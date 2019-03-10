import com.google.entity.Employee;

public class Test4 {

    void foo(Employee employee){
        //employee.setSalary(2000);
        employee = new Employee("jerry", 9000);
    }
 public static void main(String[] args){
        Test4 t = new Test4();
        Employee tom
                = new Employee("tom", 1000);
        t.foo(tom);
        System.out.println(tom); //这里括号里填employee也完全不影响
 }
}


