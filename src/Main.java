


public class Main {

    public static void main(String [ ] args){

        String test = "12774212857X4109";

        LuhnAlgorithm LA = new LuhnAlgorithm();
        int x = LA.calculate(test);
        StringBuilder result = new StringBuilder(x);
        System.out.println(x);
        System.out.println(result.toString());




    }

}
