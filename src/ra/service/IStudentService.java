package ra.service;

import ra.model.Student;

public interface IStudentService {
    // định nghĩa ra 4 phương thức trừu tượng thực hiện crud
    Student[] findALl();
    boolean create (Student student);
    void update(Student student);
    void delete(int id);
    int getSize(); // trả về số lượng phần tử khác null
    int indexOfStudents(int id);
}
