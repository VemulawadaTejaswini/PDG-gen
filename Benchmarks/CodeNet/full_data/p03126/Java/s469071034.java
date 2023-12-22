import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        if(n == 1) {
            System.out.println(sc.nextInt());
        } else {
            int result = 0;
            for(int i = 0; i < n; i++) {
                if(sc.nextInt() == n) result++;
                sc.nextLine();
            }
            System.out.println(result);
        }
    }
}
