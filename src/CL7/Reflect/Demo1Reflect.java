package CL7.Reflect;

/**
 * @author Promise
 * @create 2019-08-23-13:27
 */
public class Demo1Reflect {
    //获取Class对象的三种方式
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName("全类名")
        Class cls1 = Class.forName("CL7.Reflect.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //用==比较三个对象
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

        System.out.println(cls1 == Student.class);

    }
}
