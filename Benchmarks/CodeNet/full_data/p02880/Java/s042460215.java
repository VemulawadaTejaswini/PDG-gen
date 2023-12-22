import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = "";
        loop:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (a == i * j) {
                    b = "Yes";
                    break loop;
                } else {
                    b = "No";
                }
            }
        }
        System.out.println(b);
    }
}