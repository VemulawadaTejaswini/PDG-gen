import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        List<Integer> nl = new ArrayList<>(num);
        while (in.hasNextInt()) {
            nl.add(in.nextInt());
        }
        int a = nl.get(0);
        int b = 0;
        int c = 0;
        int ac = 0;
        int bc = 0;
        int cc = 0;
        boolean isNo = false;
        boolean isContainsZero = false;
        String ans = "No";
        isContainsZero = nl.contains(Integer.valueOf(0));

        if (!isContainsZero) {
            for (int i = 0; i < nl.size(); i++) {
                if (nl.get(i) != a) {
                    b = nl.get(i);
                    break;
                }
            }
            for (int i = 0; i < nl.size(); i++) {
                if (nl.get(i) != a && nl.get(i) != b) {
                    c = nl.get(i);
                    break;
                }
            }
            for (int i = 0; i < nl.size(); i++) {
                if (nl.get(i) == a) {
                    ac++;
                } else if (nl.get(i) == b) {
                    bc++;
                } else if (nl.get(i) == c) {
                    cc++;
                } else {
                    isNo = true;
                    break;
                }
            }
            if ((a ^ b) != c) {
                isNo = true;
            }
            if (ac == bc && ac == cc && !isNo) {
                ans = "Yes";
            }
        } else {
            for (int i = 0; i < nl.size(); i++) {
                if (nl.get(i) != 0) {
                    a = nl.get(i);
                    break;
                }
            }
            for (int i = 0; i < nl.size(); i++) {
                if (nl.get(i) != a) {
                    ac++;
                } else if (nl.get(i) == 0) {
                    bc++;
                } else {
                    isNo = true;
                    break;
                }
            }
            if (!isNo && ac == 2 * bc) {
                ans = "Yes";
            }
        }
        System.out.println(ans);

    }
}
