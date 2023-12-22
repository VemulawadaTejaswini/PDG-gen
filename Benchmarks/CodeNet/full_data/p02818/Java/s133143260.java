import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        for (int i = 0; i < k; i++)
            if (a > 0) --a;
            else
                if (b > 0) --b;
        System.out.println(a + " " + b);
    }
}