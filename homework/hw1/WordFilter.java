import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordFilter {
    public static void main(String[] args) {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = null;

        try {
            inputLine = inputReader.readLine();
            String[] words = inputLine.split("[^a-zA-Z]+");
            Set<String> uniqueWords = new HashSet<String>();
            for (String word : words) {
                uniqueWords.add(word.toLowerCase());
            }
            for (String word : uniqueWords) {
                System.out.println(word);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
