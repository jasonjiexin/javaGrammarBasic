/**
 * Created by Jason on 2017/10/6.
 * 成员变量与类变量
 */
public class ShapeTester {
    public static void main(String arg[]){
        Circle x;
        Rectangle y, z;
        x = new Circle();
        y = new Rectangle();
        z = new Rectangle();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

    //如果没有声明这个类Rectangle将没有办法被使用,但是这里为什么是使用static
    static class Rectangle{}
}
