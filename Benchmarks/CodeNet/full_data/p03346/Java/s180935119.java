import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count_fin =0;
        int cnt =0;
        for (int i = 0; i < n; i++) {
            int count = a[i] + 1;
            for (int j = i; j < n; j++) {
                if (count == a[j]) {
                    count++;
                    cnt++;
                }
            }
            if(count_fin < cnt){
                count_fin = cnt;
            }
            cnt =0;
        }

        System.out.println(n - (count_fin+1));



    }
}
