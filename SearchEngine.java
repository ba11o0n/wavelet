import java.io.IOException;
import java.net.URI;

public class SearchEngine implements URLHandler  {
        // The one bit of state on the server: a number that will be manipulated by
        // various requests.
        ArrayList<String> list = new ArrayList<>(); 
    
        // public String handleRequest(URI url) {
        //     if (url.getPath().equals("/")) {
        //         return String.format("Kathleen's Number: %d", num);
        //     } else if (url.getPath().equals("/increment")) {
        //         num += 1;
        //         return String.format("Number incremented!");
        //     } else {
        //         System.out.println("Path: " + url.getPath());
        //         if (url.getPath().contains("/add")) {
        //             String[] parameters = url.getQuery().split("=");
        //             if (parameters[0].equals("count")) {
        //                 num += Integer.parseInt(parameters[1]);
        //                 return String.format("Number increased by %s! It's now %d", parameters[1], num);
        //             }
        //         }
        //         return "404 Not Found!";
        //     }
        }

