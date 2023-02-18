import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OutputWriter {
    public static void main(String[] args) {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
