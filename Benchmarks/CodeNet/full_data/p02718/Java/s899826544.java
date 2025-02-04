import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int cnt = 0;
        int sum = Arrays.stream(a).sum();
        double line = sum / 4.0 / m;

        for(int i = 0; i < n; i++){
            if (a[i] > line){
                cnt++;
            }
        }

        System.out.println(cnt>=line?"Yes":"No");
    }
}
