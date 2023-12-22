import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[55];
        for(int i = 1; i <= n; ++i){
            a[i] = input.nextInt();
        }
        int[][] b = new int[55][2];
        int sum = 0;
        for(int i = 1; i <= n; ++i){
            if(a[i] != i){
                b[sum][0] = i;
                b[sum][1] = a[i];
                sum++;
            }
        }
        if(sum <= 2) System.out.println("YES");
        else System.out.println("NO");
    }
}
