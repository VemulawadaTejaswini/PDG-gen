import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int standard = calculationStandard(list);

        System.out.println(calsulationResult(list, standard));
    }

    private static int calculationStandard(List<Integer> list) {
        int SUM = 0;
        for (int number : list) {
            SUM += number;
        }

        int quotient = SUM / list.size();
        int surplus = SUM % list.size();

        if (surplus >= list.size() / 2.0) {
            quotient++;
        }

        return quotient;
    }

    private static int calsulationResult(List<Integer> list, int standard) {
        int result = 0;
        for (int i : list) {
            result += (i - standard) * (i - standard);
        }

        return result;
    }
}