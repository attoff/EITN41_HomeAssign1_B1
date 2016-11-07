import java.util.ArrayList;

public class LuhnAlgorithm {
    private StringBuilder sb;
    private ArrayList<Integer> odd;
    private ArrayList<Integer> even;
    private Character c;
    private int sum;
    private boolean isEven;

    public LuhnAlgorithm() {

    }

    public int calculate(String number) {
        odd = new ArrayList<>();
        even = new ArrayList<>();
        sum = 0;
        isEven = false;

        sb = new StringBuilder(number);
        sb.reverse();
        addToList();
        sumLists();
        int answer;
        if (sum % 10 != 0) {
            answer = 10 - sum % 10;
        } else {
            answer = 0;
        }
        if (isEven) {
            if (answer % 2 == 0) {
                answer = answer / 2;
            } else {
                switch (answer) {
                    case 1:
                        answer = 5;
                        break;
                    case 3:
                        answer = 6;
                        break;
                    case 5:
                        answer = 7;
                        break;
                    case 7:
                        answer = 8;
                        break;
                    case 9:
                        answer = 9;
                        break;
                }
            }
        }
        return answer;
    }

    private void addToList() {
        for (int i = 0; i < sb.length(); i++) {
            c = sb.charAt(i);

            if ((i % 2) == 1) {
                if (Character.isDigit(c)) {
                    int v = Character.getNumericValue(c);
                    v = v * 2;

                    if (v > 9) {
                        v = v % 10 + 1;
                    }
                    even.add(v);
                } else {
                    isEven = true;
                }

            } else {
                if (Character.isDigit(c)) {
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
