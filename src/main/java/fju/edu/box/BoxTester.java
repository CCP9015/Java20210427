package fju.edu.box;

import java.util.ArrayList;
import java.util.List;

public class BoxTester {
    public static void main(String[] args) {
       ArrayList list = new ArrayList();
       list.add("Hello");
       /*八種資料型態
       Integer a = new Integer(123);
       Short s = new Short();
       Byte b = new Byte();
       Long l = new Long();
       Double d = new Double();
       Float f = new Float();
       Boolean boo = new Boolean();
       Character c = new Character();
       */
       list.add(124563);
       String name = (String)list.get(0);
       String name2 = (String)list.get(1);
       //轉型
       //限定同質
        Box box = new Box1();
       list.add(box);
       list.add(false);



    }
}
