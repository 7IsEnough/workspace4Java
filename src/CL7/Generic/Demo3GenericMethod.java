package CL7.Generic;

/**
 * @author Promise
 * @create 2019-08-01-17:01
 */
public class Demo3GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();
        /*
        *调用含有泛型的方法method01
        * 传递什么类型，泛型就是什么类型
        */
        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        gm.method02("静态方法，不建议创建对象使用");

        //静态方法，通过类名.方法名()
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }
}
