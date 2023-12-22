import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer[] arr = { a, b, c };
        Arrays.sort(arr, Comparator.reverseOrder());

        int ans = Integer.parseInt(String.valueOf(arr[0]) + String.valueOf(arr[1])) + arr[2];
        System.out.println(ans);
    }

}

