package ra.serviceimplement;

import ra.model.Teacher;
import ra.service.IGenericService;
import ra.service.ITeacherService;

public class TeacherService implements ITeacherService {
    @Override
    public Teacher[] findALl() {
        return new Teacher[0];
    }

    @Override
    public boolean create(Teacher teacher) {
        return false;
    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int indexOf(Long id) {
        return 0;
    }
}
