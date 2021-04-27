package fju.edu.box;

public class Test {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(),new Box2(),new Box3(),new Box4(),new Box5(),new Box6() };
        int len = 10;
        int wid = 15;
        int hig = 15;
        for (Box box : boxes){
            if(box.value(len ,wid ,hig )){
                System.out.println(box.name + " it is, " + box.price);
                break;
            }
        }

    }
}
