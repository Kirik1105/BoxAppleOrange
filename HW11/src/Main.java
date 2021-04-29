import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        Object[] objects = new Object[3];
        objects[0] = 3;
        objects[1] = 9;
        objects[2] = 13;
        System.out.println("В обекте 1:" + objects[0]);
        System.out.println("В обекте 2:" + objects[1]);
        System.out.println("В обекте 3:" + objects[2]);
        System.out.println("----------------");
        revers(objects, 0, 2);
        System.out.println("В обекте 1:" + objects[0]);
        System.out.println("В обекте 2:" + objects[1]);
        System.out.println("В обекте 3:" + objects[2]);
        
        //Задание 2
        ArrayList arrayList = toArrayList(objects);
        System.out.println(arrayList.get(0));

        //Задание 3
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box box1 = new Box(orange, 3);
        Box box2 = new Box(orange, 5);
        Box box3 = new Box(apple, 5);
        box1.getInfo();
        box1.replace(box2);
        box1.getInfo();
        box2.getInfo();
        box2.addFruits(5);
        box2.getInfo();
        box3.getInfo();
        System.out.println(box1.compare(box2));
    }

    public static void revers(Object[] arr, int obj1, int obj2) {
        Object tmp = arr[obj1];
        arr[obj1] = arr[obj2];
        arr[obj2] = tmp;
    }

    public static ArrayList toArrayList(Object[] arr) {
        ArrayList arrayList = new ArrayList<>(arr.length);
        for (int x = 0; x < arr.length; x++) {
            arrayList.add(arr[x]);
        }
        return arrayList;
    }
}
