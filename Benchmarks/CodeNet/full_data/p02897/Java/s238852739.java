import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                a++;
            else
                b++;

        }
        
        System.out.println((double) b / (a + b));
    }
}