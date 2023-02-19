import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputWriter {
    private static BufferedReader _inputReader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void Ouput() {
        String line;
        try {
            while ((line = _inputReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OutputWriter.Ouput();
    }
}
