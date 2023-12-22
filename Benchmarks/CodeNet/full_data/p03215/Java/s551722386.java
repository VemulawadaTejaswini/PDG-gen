import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int[] ton = new int[n];
        int[] to0 = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        ton[0] = a[0];
        to0[0] = a[n-1];
        for(int i = 1; i < n; i++){
            ton[i] = ton[i-1] + a[i];
        }
        int c = 1;
        for(int i = n-2; i >= 0; i--){
            to0[c] = to0[c-1] + a[i];
            c++;
        }
        int sub = 0;
        int x = 0;
        int y = 0;
        for(int i = 1; i < k; i++){
            if(ton[x] > to0[y]){
                sub = to0[y];
                y++;
            }else if(ton[x] < to0[y]){
                sub = ton[x];
                x++;
            }else{
                sub = ton[x];
                x++;
            }
        }
        System.out.println(sum - sub);
    }
}
