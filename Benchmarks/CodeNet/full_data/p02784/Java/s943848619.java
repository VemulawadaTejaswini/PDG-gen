import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];
        int asum = 0;

        for( int i = 0 ; i < n ; i++){
            a[i] = scanner.nextInt();
            asum += a[i];
        }

        String result = h > asum ? "No" : "Yes";
        System.out.println(result);
    }
}