package CL7.Thread.WaitAndNotify;

/**
 * @author Promise
 * @create 2019-08-13-22:02
 */
public class Demo1WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
               while (true){
                   //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                   synchronized (obj){
                       System.out.println("告知老板要的包子的种类和数量");
                       //调用wait方法，放弃CPU的执行，进入到Waiting状态(无线等待)
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       //唤醒之后执行的代码
                       System.out.println("包子已经做好了，开吃");
                   }
               }
            }
        }.start();

        //创建一个老板线程(生产者)
        new Thread(){
            @Override
            public void run() {
                //一直做包子
                while (true){
                    //花5s做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("老板5s后做好包子，告知顾客，可以吃包子了");
                        System.out.println("=====================");
                        //做好包子后，调用notify方法，唤醒顾客吃包子
                        obj.notify();
                    }
                }

            }
        }.start();

    }
}
