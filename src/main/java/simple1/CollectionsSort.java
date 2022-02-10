package simple1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsSort {
    public void intgerList() {
        List<Integer> interList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            interList.add(random.nextInt(100));
            do {
                random.nextInt(100);
            } while (interList.contains(random));
        }
        System.out.println("----排序前-----");
        for (Integer intg:interList) {
            System.out.println(intg);
        }
        System.out.println("----排序后----");
        Collections.sort(interList);
        for (Integer intg:interList) {
            System.out.println(intg);
        }
    }

    public static void main(String[] args) {
        CollectionsSort cs = new CollectionsSort();
        cs.intgerList();
    }
}