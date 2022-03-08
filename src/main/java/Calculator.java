import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public int addition() {
        List<Integer> addition = new ArrayList();
        addition.add(1);
        addition.add(3);
        addition.add(4);

        int sum =0;
        for(int i =0; i<addition.size(); i++) {
            sum += addition.get(i);
        }

        return sum;
    }

    public int subtraction(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    public int multiply(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public int divide(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }

    public int squareroot(int num1, int num2) {
        int square = (num1 + num2) * (num1 + num2);
        return square;
    }
}
