package ra;

import ra.model.Calculator;
import ra.model.Student;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student(1,"Hùng",19,true);
        Student s2= new Student(2,"Nam",19,true);
        System.out.println(Calculator.sum(2,3));
        System.out.println(Calculator.sum(s1,s2));
    }
}
