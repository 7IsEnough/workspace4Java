package CL7.Polymorphism.Polymorphism1;

/**
 * @author Promise
 * @create 2019-07-24-21:43
 */
public class Zi extends Fu {
    int num = 20;

    int age = 24;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}