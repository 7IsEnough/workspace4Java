package CL7.Thread.WaitAndNotify;

/**
 * @author Promise
 * @create 2019-08-13-16:59
 */
public class BaoZiPu extends Thread{
    //1.需要再成员位置创建一个包子变量
    private BaoZi bz;

    //2.使用带参数构造方法，为这个包子变量赋值
    public BaoZiPu(BaoZi bz){
        this.bz = bz;
    }
    //设置线程任务：生产包子
    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        while (true){
            //必须同时同步技术包子两个线程只能有一个在执行
            synchronized (bz){
                //对包子的状态进行判断
                if (bz.flag==true){
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行，包子铺生产包子
                //交替生产两种包子
                if (count%2==0){
                    //生产 薄皮三鲜馅包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else {
                    //生产 冰皮牛肉大葱馅包子
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产:"+bz.pi+bz.xian+"包子");
                //生产包子需要3s
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子铺生产好了包子
                //修改包子的状态为true
                bz.flag = true;
                //唤醒吃货线程，让吃货线程吃包子
                bz.notify();
                System.out.println("包子铺已经生产好了:"+bz.pi+bz.xian+"包子，吃货可以开始吃了");
            }
        }

    }
}
