package ra.run;

import javafx.scene.transform.Scale;
import ra.model.Student;
import ra.service.IStudentService;
import ra.service.ISubjectService;
import ra.service.ITeacherService;
import ra.serviceimplement.StudentService;
import ra.serviceimplement.SubjectService;
import ra.serviceimplement.TeacherService;

import java.util.Scanner;

public class StudentManager {
    private static IStudentService studentService = new StudentService();
    private static ISubjectService subjectService = new SubjectService();
    private static ITeacherService teacherService = new TeacherService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------MENU--------------------------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên");
            System.out.println("4. Xóa sinh viên sinh viên");
            System.out.println("5. Thoát");

            System.out.println("Nhập lựa chọn của bạn");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
//                    Hiển thị
                    Student[] students = studentService.findALl();
                    int count =studentService.getSize();
                    if(count==0){
                        System.out.println("Chưa có sinhh viên");
                    }else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 2:
                    // thêm mới
                    System.out.println("Nhập thông tin thêm mới");
                    System.out.println("Nhâp id :");
                    int idNew;
                    while(true){
                        idNew = sc.nextInt();
                        if(studentService.indexOf(idNew)==-1){
                            // chưa tồn tại
                            break;
                        }
                        System.err.println("id đã tồn tại, vui lòng nhập lại");
                    }
                    sc.nextLine();
                    System.out.println("Nhập tên :");
                    String newName = sc.nextLine();
                    System.out.println("Nhập tuổi :");
                    int newAge = sc.nextInt();
                    System.out.println("Nhập giới tính :");
                    sc.nextLine();
                    boolean sex = Boolean.parseBoolean(sc.nextLine());
                    Student s = new Student(idNew,newName,newAge,sex);
                    studentService.create(s);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    // chỉnh sửa
                    System.out.println("Nhâp id cần sửa:");
                    int idEdit = sc.nextInt();
                    if (studentService.indexOf(idEdit)==-1){
                        System.err.println("không tồn tại id ");
                    }else {
                        // tiến hành sửa thông tin
                        sc.nextLine();
                        System.out.println("Nhập tên :");
                        String updateName = sc.nextLine();
                        System.out.println("Nhập tuổi :");
                        int updateAge = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhập giới tính :");
                        boolean updateSex = Boolean.parseBoolean(sc.nextLine());
                        Student studentUpdate = new Student(idEdit,updateName,updateAge,updateSex);
                        studentService.update(studentUpdate);
                        System.out.println("Chỉnh sửa thành công");
                    }
                    break;
                case 4:

                    // xóa
                    System.out.println("Nhâp id cần xóa:");
                    int idDelete = sc.nextInt();
                    if (studentService.indexOf(idDelete)==-1){
                        System.err.println("không tồn tại id ");
                    }else{
                        studentService.delete(idDelete);
                        System.out.println("Xóa thành công");
                    }
                        break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
