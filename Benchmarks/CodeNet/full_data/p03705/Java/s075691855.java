import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(0);
            return;
        }
        if (a == b) {
            if (n == 1) {
                System.out.println(1);
                return;
            }
            System.out.println(0);
            return;
        }
        // a < b
        if (n < 2) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            System.out.println(1);
            return;
        }
        // a < b && n > 2
        HashSet<Integer> sumSet = new HashSet<>();
        for (int i = a; i <= b; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            tempList.add(i);
            combine(tempList, i, b, n, sumSet);
        }
        System.out.println(sumSet.size());
    }

    private static void combine(ArrayList<Integer> list, int begin, int end, int n, HashSet<Integer> sumSet) {
        if (list.size() < n - 2) {
            for (int i = begin; i <= end; i++) {
                ArrayList<Integer> tempList = new ArrayList<>(list);
                tempList.add(i);
                combine(tempList, i, end, n, sumSet);
            }
        } else {
            sumSet.add(list.stream().reduce(0, (a, b) -> a + b));
        }
    }
}
