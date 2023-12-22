import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = num/2;
        int x = num%2;
        int c = (a + x) * x;
        System.out.println(c);
        scan.close();
    }
}
