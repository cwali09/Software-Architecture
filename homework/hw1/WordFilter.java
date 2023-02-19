import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class WordFilter {
    private static BufferedReader _inputReader = new BufferedReader(new InputStreamReader(System.in));

    public static void FilterUniqueWords(String inputLine) {
        String[] words = inputLine.split("[^a-zA-Z]+");
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) throws IOException {        
        String inputLine;
        String f_line = "";
        while ((inputLine = _inputReader.readLine()) != null) {
            f_line = String.join(f_line, inputLine);
        }
        WordFilter.FilterUniqueWords(f_line);

        /* UNCOMMENT TO DEMONSTRATE CONCURRENCY CAPABILITY FOR PIPE & FILTER */
        // final String f_line2 = f_line;
        // for (int i = 0; i < 3; i++) {
        //     new Thread(() -> {
        //         WordFilter.FilterUniqueWords(f_line2);
        //     }).start();
        // }
    }
}
