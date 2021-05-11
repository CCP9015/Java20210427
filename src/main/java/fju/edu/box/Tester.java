package fju.edu.box;

import java.util.TreeSet;

public class Tester {


    public static void main(String[] args) {
        TreeSet<Integer> aa = new TreeSet<Integer>();
        aa.add(1);
        aa.add(2);
        System.out.println(aa.size());
        TreeSet<String> bb = new TreeSet<>();
        bb.add("abc");
        bb.add("zxc");
        for (String s : bb) {
            System.out.println(s);
        }

    }
}
