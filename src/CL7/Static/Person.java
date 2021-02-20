package CL7.Static;

/**
 * @author Promise
 * @create 2019-07-23-13:38
 * 静态代码块
 */
public class Person {
    static {
        System.out.println("静态代码块执行");
    }
    public Person(){
        System.out.println("构造方法执行");
    }
}