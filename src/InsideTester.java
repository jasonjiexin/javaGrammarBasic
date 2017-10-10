public class InsideTester {
    public static void main(String args[]){
        Circle2 c1 = new Circle2();
        c1.radius = 8;
        Circle2 c2 = new Circle2();
        c2.radius = 15;

        Rectangle r = new Rectangle();
        r.width = 20;
        r.height = 30;

        //形式参数为类、对象时调用
        System.out.println("Circle 1 first inside Rectangle:" + c1.fitsInside(r));
        System.out.println("Circle 2 first inside Rectangle:" + c2.fitsInside(r));
    }
}
