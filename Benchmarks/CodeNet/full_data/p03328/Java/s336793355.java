import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sa = b-a;
        int sum = 0;
        for(int i = 0; i < sa; i++) {
            sum += i;
        }
        System.out.println(sum - a);
    }
}
