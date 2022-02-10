package simple1;

import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    public Map<String,students> student;

    public MapTest(){
        this.student = new HashMap<String,students>();
    }

    /**
     * 添加：输入学生id，判断是否被占用
     * 若未被占用，则输入姓名，创建新学生对象，并添加到student中
     * 若已经占用则提示
     */
    public void testPut(){
        //创建一个Scnner对象
        Scanner scan = new Scanner(System.in);
        int i = 0;
        //3次循环
        while (i < 3){
            System.out.println("请输入学生ID");
            String Id = scan.next();
            if(student.get(Id)==null){
                System.out.println("请输入学生姓名");
                String name = scan.next();
                students stu = new students(Id,name);
                student.put(Id,stu);
                i++;
                continue;

            }else {
                System.out.println("您输入的id已被占用");
            }
        }
    }

    public void testKeySet(){
        //通过keyset方法返回map中的键的集合
        Set<String> keySet = student.keySet();
        System.out.println("已添加：");
        for (String stuId : keySet) {
            students stu = student.get(stuId);
            if (stu != null){
                System.out.println(stu.getId()+":"+stu.getName());
            }
        }

    }

    public void testRemove(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("输入你想删除的ID:");
            String ID = scan.next();
            students stu = student.get(ID);
            if ( stu == null){
                System.out.println("想删除的ID不存在");
                continue;
            }
            student.remove(ID);
            System.out.println("已删除学员："+stu.getName());
            break;
        }
    }

    public void testEntrySet(){
        Set<Map.Entry<String,students>> entrySet = student.entrySet();
        for (Map.Entry<String,students> entry:entrySet){
            System.out.println("ID："+entry.getKey());
            System.out.println("姓名："+entry.getValue().getName());

        }
    }

    //使用put方法，修改数据
    public void testModify(){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("请输入要修改的ID：");
            String stuID = scan.next();
            students stu = student.get(stuID);
            if(stu ==null){
                System.out.println("输入的ID不存在，请重新输入");
                continue;
            }
            System.out.println("请输入要修改后的姓名");
            String Name = scan.next();
            students newStu = new students(stuID,Name);
            student.put(stuID,newStu);
            break;
        }

    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
        //mt.testRemove();
        mt.testModify();
        mt.testEntrySet();

    }
}