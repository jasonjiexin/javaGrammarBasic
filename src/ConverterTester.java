/***
 * jason 20171010
 * 测试类ConverterTester
 */

public class ConverterTester {
    public static void main(String args[]){
        int cent = 40;
        int fah = Converter.centigradeToFahrenheit(cent);
        System.out.println("摄氏度转化华氏度为：" + fah + "度");
    }
}
