import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        String ans = "No";

        int a2c = Math.abs(a-c);
        if (a2c<=d){
            ans="Yes";
        }else{
            int a2b = Math.abs(a-b);
            int b2c = Math.abs(b-c);
            if (a2b<=d && b2c<=d){
                ans="Yes";
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
