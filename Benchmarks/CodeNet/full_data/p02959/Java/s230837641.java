import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[100005];
        int[] b = new int[100005];
        for(int i = 0; i < n + 1; ++i){
            a[i] = input.nextInt();
        }
        for(int i = 0; i < n; ++i){
            b[i] = input.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < n + 1; ++i){
            if(i == 0){
                if(b[i] > a[i]){
                    sum += a[i];
                    b[i] -= a[i];
                }
                else{
                    sum += b[i];
                    b[i] = 0;
                }
            }
            else{
                if(b[i - 1] > a[i]){
                    sum += a[i];
                    b[i - 1] -= a[i];
                }
                else{
                    a[i] -= b[i - 1];
                    sum += b[i - 1];
                    b[i - 1] = 0;
                }
                if(b[i] > a[i]){
                    sum += a[i];
                    b[i] -= a[i];
                }
                else{
                    sum += b[i];
                    b[i] = 0;
                }
            }
        }
        System.out.println(sum);
    }
}
