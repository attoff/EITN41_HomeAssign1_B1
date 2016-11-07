import java.util.ArrayList;

public class LuhnAlgorithm {
    private StringBuilder sb;
    private ArrayList<Integer> odd;
    private ArrayList<Integer> even;
    private Character c;
    private int sum;

    public LuhnAlgorithm() {

    }

    public int calculate(String number) {
        odd = new ArrayList<>();
        even = new ArrayList<>();
        sum = 0;

        sb = new StringBuilder(number);
        sb.reverse();
        addToList();
        sumLists();
        int answer;
        if (sum%10 != 0) {
            answer = 10 - sum % 10;
        }else {
            answer = 0;
        }
        return answer;
    }

    private void addToList() {
        for (int i = 0; i < sb.length(); i++) {
            c = sb.charAt(i);

            if (Character.isDigit(c)) {
                if ((i % 2) == 1) {
                    int v = Character.getNumericValue(c);
                    v = v * 2;

                    if (v > 9) {
                        v = v % 10 + 1;
                    }
                    even.add(v);

                } else {
                    odd.add(Character.getNumericValue(c));
                }

            }
        }
    }

    private void sumLists() {

        for (int i = 0; i < odd.size(); i++) {
            sum += odd.get(i);
        }
        for (int i = 0; i < even.size(); i++) {
            sum += even.get(i);
        }

    }


}
