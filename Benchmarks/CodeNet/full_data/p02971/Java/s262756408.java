import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer[] ary = new Integer[N];
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
        }
        Integer[] sortAry = ary.clone();
        Arrays.sort(sortAry, Comparator.reverseOrder());
        int maxNum = sortAry[0];
        int secondNum = sortAry[1];
        for (int i = 0; i < N; i++) {
            if (maxNum > ary[i]) {
                System.out.println(maxNum);
            } else {
                System.out.println(secondNum);
            }
        }
    }
}