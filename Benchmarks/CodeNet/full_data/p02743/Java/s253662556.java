import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c) + 0.0000001) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}