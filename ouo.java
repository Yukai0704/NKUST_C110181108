import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ouo {
    public static void main(String[] args) throws IOException {
        try {
            String URL_1 = "https://ck101.com";
             String URL_2 = "";
            String URL_board = "";
            Document index_2 = new Document("");

            Document index_1 = Jsoup.connect(URL_1).get();
            System.out.println(index_1.title());
            Element head = index_1.select("div.channel_title_h1").first();
            System.out.println("======="+head.text()+"======="); //channel_menu sticky_position_with_15

         
  
