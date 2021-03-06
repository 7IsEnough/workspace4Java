package Xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

/**
 * @author promise
 * @date 2020/3/22 - 15:09
 * Jsoup对象功能
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象，根据Xml文档获取
        //2.1获取student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析Xml文档，加载文档进内存，获取dom树--->Document
//        Document document = Jsoup.parse(new File(path), "utf-8");
//        System.out.println(document);

        //parse(String html):解析xml或html字符串
//        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
//                "\n" +
//                "<students>\n" +
//                "\n" +
//                "    <student number=\"heima_0001\">\n" +
//                "        <name>tom</name>\n" +
//                "        <age>18</age>\n" +
//                "        <sex>male</sex>\n" +
//                "    </student>\n" +
//                "\n" +
//                "    <student number=\"heima_0002\">\n" +
//                "        <name>jack</name>\n" +
//                "        <age>18</age>\n" +
//                "        <sex>female</sex>\n" +
//                "    </student>\n" +
//                "\n" +
//                "\n" +
//                "\n" +
//                "</students>";
//        Document document = Jsoup.parse(str);
//        System.out.println(document);

        //parse(URL url,int timeoutMillis):通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");//代表网络中的一个资源路径
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);


    }
}
