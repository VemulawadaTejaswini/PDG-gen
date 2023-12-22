import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }

        int result = 1;
        int first = getGcd(a.get(0), a.get(1));
        if (a.size() == 2) {
            result = first;

        } else {
            int maxIndex = 3;
            maxIndex = Math.min(maxIndex, n);
            for (int i = 0; i < maxIndex - 1; i++) {
                for (int j = 1 + i; j < maxIndex; j++) {
                    result = Math.max(result, getGcd(a.get(i), a.get(j)));
                }
            }
        }

        System.out.println(result);
    }

    public static int getGcd(int a, int b) {
        int temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}