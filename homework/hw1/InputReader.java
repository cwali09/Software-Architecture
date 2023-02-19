import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class InputReader {
    private static List<String> _lines = new ArrayList<>();

    public static void Read(String filename) {
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(filename)); // Need this to read text from file
            String line;
            while ((line = reader.readLine()) != null) {
                _lines.add(line);
                System.out.println(line);
            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InputReader.Read(args[0]);
    }
}