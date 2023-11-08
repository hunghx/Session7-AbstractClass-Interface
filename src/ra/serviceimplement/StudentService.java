package ra.serviceimplement;

import ra.model.Student;
import ra.service.IStudentService;

public class StudentService implements IStudentService {
    private Student[] students = new Student[100];
    private int count=0;

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public Student[] findALl() {
        return students;
    }

    @Override
    public boolean create(Student student) {
        if( count < students.length){
            students[count] = student; // chèn phần tử vào cuối mảng
            count++;
            return true;
        }
        return false;
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId()== student.getId()){
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete(Integer id) {
        int  indexDelete = indexOf(id);
        for (int i = indexDelete; i < count - 1; i++) {
                students[i] = students[i + 1];
        }
        students[count - 1] = null;
        count--;
    }

    @Override
    public int indexOf(Integer id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId()==id){
                return i;
            }
        }
        return -1;
    }
}
