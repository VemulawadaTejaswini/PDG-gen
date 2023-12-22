import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nt=0 ,kt=0;
        for(int i=1; i<n; i++) {
            nt += i;
        }
        for(int i=1; i<k; i++) {
            kt += i;
        }
        System.out.println(nt + kt);
    }
}