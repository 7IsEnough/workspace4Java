package CL7.Interface.Interface1;

/**
 * @author Promise
 * @create 2019-07-24-19:34
 */
public interface MyInterfaceB {
    //错误写法！接口不能有静态代码块
//    static{
//
//    }

    //错误写法，接口不能有构造方法
//    public MyInterfaceB(){
//
//    }

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}