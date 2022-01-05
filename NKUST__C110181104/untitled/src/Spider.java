public class Spider {
    public static void main(String[] args) {
        try {
           Document view = Jsoup.connect("https://virtual-youtuber.userlocal.jp/document/ranking").get();//爬蟲網址
           System.out.println(view.title());//輸出網頁標題
           for(int i = 1; i <= 10; i++){//抓取前10位vtuber
           String a = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.col-name > div:nth-child(1) ").text();//vtuber姓名的元素
     catch (Exception e) {
        System.out.println("error" + e);
   }
}
}
