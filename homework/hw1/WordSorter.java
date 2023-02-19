import java.io.*;
import java.util.ArrayList;

public class WordSorter {
    public static BufferedReader _inputReader = new BufferedReader(
        new InputStreamReader(System.in));
    public static ArrayList<String> _words = new ArrayList<>();

    public static void FilterWords() {
        try {
            String line = "";
            while ((line = _inputReader.readLine()) != null) {
                _words.add(line);
            }
            _words.sort(null);
            
            String f_line = "";
            for (String word : _words) {
                f_line = String.join(" ", f_line.trim(), word);
            }
            System.out.println(f_line);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WordSorter.FilterWords();
    }
}
