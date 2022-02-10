package simple1;

import java.util.Objects;

/**
 * 课程类
 */
public class Course {
    private String id;
    private String name;

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
    public Course(String id,String name){
        this.id = id;
        this.name = name;
    }
    //重载
    public Course(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        if (name==null){
            if (course.name != null)
                return false;
        }else if(!name.equals(course.name))
            return false;
        return true;
        //return Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
