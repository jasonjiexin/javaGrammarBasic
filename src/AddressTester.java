/**
 * Created by Jason on 2017/10/6.
 * 成员变量与类变量
 */
public class AddressTester {
    public static void main(String args[]){
        //申明变量
        Address address1, address2;
        //分配空间,Address address1 = new Address(), address2 = new Address()
        address1 = new Address();
        address2 = new Address();

        //使用变量成员属性
        address1.name = "jason";
        address1.streetName = "15";
        address1.city = "shanghai";
        address1.province = "shanghai";
        address1.postalCode = "100084";

        address2.name = "bill";
        address2.streetName = "16";
        address2.city = "beijing";
        address2.province = "beijing";
        address2.postalCode = "100094";

        //每创建一个对象相当于可以在类的模板上描述一个新的对象，类的描述就是模板
        System.out.println(address1.name);
        //打印引用变量结果是一个地址
        System.out.println(address2);

    }
}
