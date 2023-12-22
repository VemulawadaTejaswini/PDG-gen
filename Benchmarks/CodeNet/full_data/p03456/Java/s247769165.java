import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = String.valueOf(b);
        for (int i = 0; i < c.length(); i++) {
            a *= 10;
        }
        int check = b + a;

        for (int i = 1; i <= 100; i++) {
            if (check == i*i) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}