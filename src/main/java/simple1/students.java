package simple1;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 */
public class students {
    private String id;
    private String name;
    public Set<Course> Courses;

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
    //构造方法
    public students(String id, String name){
        this.id = id;
        this.name = name;
        this.Courses = new HashSet<Course>();
    }

}
