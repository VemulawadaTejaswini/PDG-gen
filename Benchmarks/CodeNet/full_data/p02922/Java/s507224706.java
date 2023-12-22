import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int now = A;
        int count = 1;
        while (B <= now) {
        	count++;
        	now += A - 1;
        }
        System.out.println(count);
    }
}