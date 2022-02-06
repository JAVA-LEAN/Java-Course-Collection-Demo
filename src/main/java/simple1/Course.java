package simple1;

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
}
