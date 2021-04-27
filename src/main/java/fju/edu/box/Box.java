package fju.edu.box;

public class Box {
    int lenth;
    int width;
    int height;
    String name;
    int price;
    public boolean value(int l ,int w ,int h){
        if(lenth <= l && width <= w && height <= h){
            return true;
        }else return false;
    }

}
