import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println(max - min);
    }
}