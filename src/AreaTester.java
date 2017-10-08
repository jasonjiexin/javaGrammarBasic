/**
 * Created by Jason on 2017/10/7.
 * 用到实例Circle2及Rectangle
 */
public class AreaTester {
    public static void main(String args[]){
        Circle2 c = new Circle2();
        c.radius = 50;
        Rectangle r = new Rectangle();
        r.width = 20;
        r.height = 30;

        System.out.println("Circle has area:" + c.area());
        System.out.println("Rectangle has area:" + r.area());
    }
}
