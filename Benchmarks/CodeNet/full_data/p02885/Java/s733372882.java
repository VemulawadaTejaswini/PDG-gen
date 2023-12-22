import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
    
            // 入力値の受け取り
        Scanner sc = new Scanner(System.in);

        // 窓の長さ
        int A = sc.nextInt();

        // カーテンの長さ
        int B = sc.nextInt();

        int C = A - B * 2;

        if (C >= 1) {
            System.out.println(C);

        } else {
            System.out.println("0");
        }
    
    
    
    }
}