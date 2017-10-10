/**
 * Created by Jason on 2017/10/7.
 * 实例方法
 */
public class Circle2 {
    static double PI = 3.1415926;
    int radius;

    public double circumference(){
        return 2*PI*radius;
    }

    //该函数没有形式参数
    public double area(){
        return PI*radius*radius;
    }

    //改变类实例变量中的radius的值
    public void enlarge(int factor){
        radius = radius * factor;
    }

    //以某个类作为函数的形式参数
    public boolean fitsInside(Rectangle r){
        return (2*radius<r.width) && (2*radius<r.height);
    }
}
