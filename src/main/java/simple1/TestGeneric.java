package simple1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestGeneric {
    //创建list
    public List<Course> courses;
    //构造函数
    public TestGeneric(){
        this.courses = new ArrayList<Course>();
    }

    //添加
    public void testAdd(){
        Course[] cr = {new Course("1","语文"),new Course("2","数学")};
        courses.addAll(Arrays.asList(cr));
        for (Course cor :courses){
            System.out.println(cor.getId()+":"+cor.getName());
        }
    }
    //用Contains方法判断list中课程是否存在
    public void testContains(){
        Scanner scan = new Scanner(System.in);
        System.out.println("输入想要查询的课程：");
        String courseName = scan.next();
        Boolean listCourse = courses.contains(courseName);
        System.out.println(listCourse);

    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testContains();
    }

}
