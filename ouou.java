import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ouou {
    public static void main(String[] args) throws IOException {
        try {
            String URL_1 = "https://ck101.com";
            String URL_2 = "";
            Document index_2 = new Document("");

            Document index_1 = Jsoup.connect(URL_1).get();
            System.out.println(index_1.title());

            Elements headline = index_1.select("div.article_container");
            Element table = headline.select("table").last();
            Elements tbody = table.select("tbody");
            int num = 0;
            if(num == 0) {
                for (Element x : tbody) {
                    Elements tr = tbody.select("tr");
                    for (Element y : tr) {
                        Elements td = y.select("td a");
                        URL_2 = URL_1 + td.attr("href");
                        System.out.println(URL_2);
                        index_2 = Jsoup.connect(URL_2).get();
                        System.out.println(index_2.title());
                    }
                    break;
                }
                
            }


            //URL_2 = URL_1 + td.attr("href");
            //index_2 = Jsoup.connect(URL_2).get();
            //System.out.printf("%s",index_2.title()+" ");
            //System.out.println(URL_2);
            //for (Element title : titles) {
            //String link = title.attr("href");
            //System.out.println("Link: " + link);
            //Document innerDoc = Jsoup.connect("https://ck101.com/" + link).get();
            //String titleText = innerDoc.select("h1").text();
            //String viewNumber = innerDoc.select("div.views").text();
            //String commentNumber = innerDoc.select("div.replys").text();
            //System.out.println("titleText: " + titleText);
            //System.out.println("viewNumber: " + viewNumber);
            //System.out.println("commentNumber: " + commentNumber);
            //Elements tags = innerDoc.select("div.tagBox a");
            //System.out.print("tag: ");
            //for (Element tag : tags) {
            //System.out.print(tag.text() + " ,");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
