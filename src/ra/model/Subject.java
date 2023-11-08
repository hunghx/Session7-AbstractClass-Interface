package ra.model;

public class Subject {
    private String id;
    private String name;
    private int zIndex;

    public Subject() {
    }

    public Subject(String id, String name, int zIndex) {
        this.id = id;
        this.name = name;
        this.zIndex = zIndex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getzIndex() {
        return zIndex;
    }

    public void setzIndex(int zIndex) {
        this.zIndex = zIndex;
    }
}
