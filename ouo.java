import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ouo {
    public static void main(String[] args) throws IOException {
        try {
            String URL_1 = "https://ck101.com";
            Document index_1 = Jsoup.connect(URL_1).get();
            System.out.println(index_1.title());

            Element table = index_1.select("table").last();
            Elements tbody = table.select("tbody");

            for (Element OUO : tbody) {
                System.out.println(OUO.text());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
