import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int last = list[n - 1];
        int max = 0;
        int nextMax = 0;
        boolean hasMax = false;
        for (int i = n - 2; i >= 0 ; i--) {
            if (last == list[i]) {
                if (hasMax) {
                    nextMax = last;
                    break;
                } else {
                    max = last;
                    last = 0;
                    hasMax = true;
                }
            } else {
                last = list[i];
            }
        }

        System.out.println(max * nextMax);
    }
}