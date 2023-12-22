import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next());
            ary[a - 1]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : ary) {
            sb.append(num);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}