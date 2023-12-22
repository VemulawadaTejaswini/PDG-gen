import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        String set = "ACGT";

        int start = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(String.valueOf(arr[i]))) {
                max = Math.max(max, i - start);
                start = i + 1;
            }
            if (i == arr.length - 1) {
                max = Math.max(max, i - start + 1);
            }
        }

        System.out.println(max);
    }
}
