import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Spider_1 {

    public static void main(String[] args) {

        try {
            Document view = Jsoup.connect("https://virtual-youtuber.userlocal.jp/document/ranking").get();
            System.out.println(view.title());
            for(int i = 1; i <= 50; i++){
                String c = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.col-name > div:nth-child(1) ").text();
                String b = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.vertical.text-right.text-nowrap > span.text-danger.font-weight-bold").text();
                String d = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.vertical.text-right.text-nowrap > div > span.text-success.font-weight-bold").text();
                System.out.println("第" + i + "名:"+c+ "　→觀看次數：(" +b+ ")"+", →訂閱數："+d);
            }
        }
        catch (Exception e) {
            System.out.println("error" + e);
        }

    }
    }




