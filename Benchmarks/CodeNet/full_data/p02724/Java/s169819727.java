import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        sum = 1000*(n/500);
        n%=500;
        sum+=(5*(n/5));
        System.out.println(sum);
    }
}