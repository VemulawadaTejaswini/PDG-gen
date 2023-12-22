import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < n; i+=2) {
            alice += arr[i];
        }
        for (int i = 1; i < n; i+=2) {
            bob += arr[i];
        }

        System.out.println(alice - bob);



    }
}