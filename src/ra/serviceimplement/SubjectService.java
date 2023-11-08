package ra.serviceimplement;

import ra.model.Subject;
import ra.service.ISubjectService;

public class SubjectService implements ISubjectService {
    @Override
    public Subject[] findALl() {
        return new Subject[0];
    }

    @Override
    public boolean create(Subject subject) {
        return false;
    }

    @Override
    public void update(Subject subject) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int indexOf(String id) {
        return 0;
    }
}
