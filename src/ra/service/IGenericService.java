package ra.service;

import ra.model.Subject;

public interface IGenericService<T,E> {
    T[] findALl();
    boolean create (T t);
    void update(T t);
    void delete(E id);
    int getSize(); // trả về số lượng phần tử khác null
    int indexOf(E id);
}
