import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;


        int i;
        if (N % 2 == 0) {
            i = 2;
        } else {
            i = 3;
        }
        while (count < N) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
    }
}