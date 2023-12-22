import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flg=false;
        int n = sc.nextInt();
        while (n > 3) {
            if (n % 4 == 0 || n >= 28 || n%7==0) {
                flg = true;
                break; 
            }
            n -= 7; 
        }
            if (flg == true) System.out.println("Yes");
            else System.out.println("No");
    }
}
