import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0){
            System.out.println("0");
        }else{
            int t = n / (a + b);
            int m = n % (a + b);
            int sum = t * a + Integer.min(a, m);
            System.out.println(sum);
        }
    }
}