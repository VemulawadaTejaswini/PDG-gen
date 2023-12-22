import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        if (n <= -l) {
            System.out.println((l + (l + n - 2)) * (n - 1) / 2);
        }
        else {
            if (l < 0)
                System.out.println(-l * (l - 1) / 2 + (n + l) * (n + l - 1) / 2);
            else
                System.out.println((n - 1) * (l + n + l) / 2);
        }
    }
}
