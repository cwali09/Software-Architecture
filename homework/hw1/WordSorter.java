import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSorter {
    public static void main(String[] args) {
        BufferedReader inputReader = new BufferedReader(
            new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();

        try {
            String line = inputReader.readLine();
            while ((line = inputReader.readLine()) != null) {
                words.add(line);
            }
            words.sort(null);
            for (String word : words) {
                System.out.println(word);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
