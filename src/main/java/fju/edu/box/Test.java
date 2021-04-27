package fju.edu.box;

public class Test {
    public static void main(String[] args) {
        Box[] boxes = {new Box1()};
        Box1 box1 = new Box1();
        System.out.println(box1.value(10,10,10));
    }
}
