package fju.edu.box;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       // Box[] boxes = {new Box1(),new Box2(),new Box3(),new Box4(),new Box5(),new Box6() };
        Box[] boxes = new Box[6];
        boxes[0] = new Box1();
        boxes[1] = new Box2();
        boxes[2] = new Box3();
        boxes[3] = new Box4();
        boxes[4] = new Box5();
        boxes[0] = new Box6();
        System.out.println(boxes[0].price);
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter object's lenth");
        int len = Integer.parseInt(scan.next());
        System.out.println("please enter object's width");
        int wid = Integer.parseInt(scan.next());
        System.out.println("please enter object's width");
        int hig = Integer.parseInt(scan.next());
        for (Box box : boxes){
  //          Box1 box1 = (Box1) box;
            if(box.value(len ,wid ,hig )){
                System.out.println(box.name + " it is, " + box.price);
                break;
            }
        }

    }
}
