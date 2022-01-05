import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class Spider {
    public static void main(String[] args) {
        System.out.println("粉絲術前十vtuber排行榜");
        try {
        Document view = Jsoup.connect("https://virtual-youtuber.userlocal.jp/document/ranking").get();//爬蟲網址
        System.out.println(view.title());//輸出網頁標題
        for(int i = 1; i <= 10; i++){//抓取10位vtuber
            String a = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.col-name > div:nth-child(1) ").text();//vtuber姓名的元素  
            String b = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.vertical.text-right.text-nowrap > span.text-danger.font-weight-bold").text();//vtuber觀看次數的元素
            String c = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.vertical.text-right.text-nowrap > div > span.text-success.font-weight-bold").text();//vtuber訂閱數的元素
            System.out.println("《"+a+"》"+"　→觀看次數：[" +b+ "]"+"； →訂閱數：["+ c+"]");//3項元素輸出
             }
            }
    catch (Exception e) {
        System.out.println("error" + e);
   }       
  }
}
