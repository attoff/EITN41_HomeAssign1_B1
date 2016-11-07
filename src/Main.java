import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Parser parser = new Parser();
        ArrayList<String> list = new ArrayList<>();
        list = parser.parse();
        LuhnAlgorithm LA = new LuhnAlgorithm();
        for (String x : list) {
            int result = LA.calculate(x);
            System.out.print(result);
        }


    }

}
