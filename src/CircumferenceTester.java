/**
 * Created by Jason on 2017/10/7.
 * 实例方法的测试，实例的类Circle2
 */
public class CircumferenceTester {
    public static void main(String args[]){
        Circle2 c1 = new Circle2();
        c1.radius = 50;
        Circle2 c2 = new Circle2();
        c2.radius = 10;

        //将类实例方法运行后的结果赋值给一个变量
        double circum1 = c1.circumference();
        double circum2 = c2.circumference();
        System.out.println("circumference1:"+circum1);
        System.out.println("circumference2:"+circum2);
    }
}
