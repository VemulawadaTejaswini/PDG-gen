import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int num = check(A,B)+check(B,C)+check(C,A);

        if(num == 0 || num == 3) {
            System.out.println("No");
        }
        if(num == 1) {
            System.out.println("Yes");
        }
        sc.close();
    }
    public static int check(int a, int b) {
        if(a == b) {
            return 1;
        } else {
            return 0;
        }
    }

}
