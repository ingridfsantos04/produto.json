//biblioteca url
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Produto {
    public static void main(String[]args) {
        //url do site
        String url = "https://infosimples.com/vagas/desafio/commercia/product.html";

        //contenter a resposta final
        Map<String, String> respostaFinal = new HashMap<>();

        //fazer request 
        documento doc = Jsoup.connect(url).get();

        //parse do responses 
        parsedHtml.title();

        //vamos pegar o título do produto, na tag h2, com id "product_title"
        respostaFinal.put("title","h2#product_title");

        //aqui você adiciona os outros campos...
        











     
    }
}