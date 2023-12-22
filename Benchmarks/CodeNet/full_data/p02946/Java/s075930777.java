import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt() - 1;
        int x = sc.nextInt();


        for (int i = x-k; i <= x+k; i++) {
            System.out.print(i + " ");
        }
    }
}