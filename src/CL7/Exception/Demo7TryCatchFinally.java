package CL7.Exception;

import java.io.IOException;

/**
 * @author Promise
 * @create 2019-08-08-16:35
 */
public class Demo7TryCatchFinally {
    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            readFile("d:\\a.tx");
        } catch (IOException e) {
            //异常处理逻辑
            e.printStackTrace();
        }finally{
            //无论是否出现异常，都会执行
            System.out.println("资源释放");
        }
    }
    /*
     *如果传递的路径，不是.txt结尾
     * 那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
     */
    public static void readFile(String filename) throws IOException {
        if(!filename.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
