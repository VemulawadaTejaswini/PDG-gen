import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 0;

        if (a >= b){
            c = a - 1;
            if (a >= c){
                System.out.println(a + c);
            } else {
                System.out.println(c + (c-1));
            }
        } else {
            c = b - 1;
            if (b >= c){
                System.out.println(b + c);
            } else {
                System.out.println(c + (c-1));
            }
        }
        sc.close();
    }
}
