import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class spider {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
            System.out.println(doc.title());
            Elements newsHeadlines = doc.select("#mp-itn b a");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.attr("title"));
                headline.attr(headline.absUrl("href"));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
