package fju.edu.box;

import java.util.ArrayList;
import java.util.List;

public class BoxTester {
    public static void main(String[] args) {
       ArrayList list = new ArrayList();
       list.add("Hello");
       list.add(124563);
       Box box = new Box1();
       list.add(box);
       list.add(false);


    }
}
