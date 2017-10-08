/**
 * Created by Jason on 2017/10/6.
 * 引用Circle1类文件
 * 成员变量与类变量
 */
public class ClassVariableTester {
    public static void main(String args[]){
        Circle1 x = new Circle1();
        //当引用成员属性的时候没有类变量

        //类变量可以使用也可以重新赋值,类变量不但可以通过对象名称来访问也能够通过类访问（对象. 或者 类.）
        System.out.println(x.PI);
        System.out.println(Circle1.PI);

        Circle1.PI = 3.14;
        System.out.println(x.PI);
        System.out.println(Circle1.PI);
    }
}
