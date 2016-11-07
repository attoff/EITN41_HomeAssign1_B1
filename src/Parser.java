import java.io.*;
import java.util.ArrayList;

/**
 * Created by Astri on 07-Nov-16.
 */
public class Parser {
    private ArrayList<String> result;
    private FileReader input;
    private String line;

    public Parser() {
        result = new ArrayList<>();
    }

    public ArrayList<String> parse() {
        try {
            input = new FileReader("src/cardNumbers.txt");
            BufferedReader bufferedReader = new BufferedReader(input);

            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }
}
