/**
 * Created by Jason on 2017/10/7.
 * 用到Circle2类
 */
public class EnlargeTester {
    public static void main(String args[]){
        Circle2 c = new Circle2();
        c.radius = 50;
        Circle2 c1 = new Circle2();
        c1.radius = 10;

        System.out.println("c的周长：" + c.circumference());
        System.out.println("c1的周长：" + c1.circumference());

        //没有返回值的函数调用方法
        c1.enlarge(4);

        System.out.println("c的周长：" + c.circumference());
        System.out.println("c1的周长：" + c1.circumference());
    }
}
