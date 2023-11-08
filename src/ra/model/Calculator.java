package ra.model;

public class Calculator {
    public static <T> String sum(T a, T b){
        return a.toString()+b.toString();
    }

    public static void main(String[] args) {
//        Calculator<Student> cal = new Calculator<>();
        Student s1= new Student(1,"Hùng",19,true);
        Student s2= new Student(2,"Nam",19,true);
        System.out.println(sum(s1,s2));
    }
}
