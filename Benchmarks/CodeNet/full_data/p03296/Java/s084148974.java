import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), result = 0, combo = 0, color = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = scanner.nextInt();

        for (int i : a) {
            if (i == color) {
                combo++;
            } else {
                result += combo / 2;
                combo = 0;
                color = i;
            }
        }
        System.out.println(result + ++combo / 2);
    }
}