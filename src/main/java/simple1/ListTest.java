package simple1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 * 备选课程类
 */
public class ListTest {
    /**
     * 存放备选课程的List
     */
    public List coursesToSelect;
   //构造方法
    public ListTest(){
        this.coursesToSelect = new ArrayList();
    }
    /**
     * 往coursesToSelect list中添加备选课程
     */
    public void testAdd() {
        //创建课程实例
        Course cr1 = new Course("1", "高等数学");
        //课程对象添加到list中
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println(temp.getId() + ":" + temp.getName());
        Course[] cr2 = {new Course("2", "C++"), new Course("3", "java")};
        coursesToSelect.addAll(0, Arrays.asList(cr2));
    }
    //获取list中的元素
    public void testFor(){
        int size = coursesToSelect.size();
        System.out.println(size);
        for (int i=0;i<size;i++){
            Course temp1 = (Course) coursesToSelect.get(i);
            System.out.println("备选课程："+temp1.getId()+":"+temp1.getName());
        }
    }

    //迭代器获取元素
    public void testIterator(){
        //创建迭代器实例
        Iterator<Course> it = coursesToSelect.iterator();
        while (it.hasNext()){
            Course cr = it.next();
            System.out.println("testIterator"+cr.getId()+":"+cr.getName());
        }
    }

    //for each
    public void testForEach(){
        System.out.println("testForEach:");
        for (Object obj:coursesToSelect){
            Course cr = (Course) obj;
            System.out.println(cr.getId()+":"+cr.getName());
        }
    }


    public void testRemove(){
        //删除一个
        coursesToSelect.remove(2);
        //删除多个
        Course[] re = {(Course) coursesToSelect.get(0), (Course) coursesToSelect.get(1)};
        coursesToSelect.removeAll(Arrays.asList(re));
        testForEach();
    }



    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testFor();
        lt.testIterator();
        lt.testForEach();
        lt.testRemove();
    }

}
