import java.util.ArrayList;

/**
 * Created by Astri on 07-Nov-16.
 */
public class MainTest {
    public static void main(String[] args) {

        LuhnAlgorithm LA = new LuhnAlgorithm();
        String x = "586604X108627571";
            int result = LA.calculate(x);
            System.out.print(result);



    }
}
