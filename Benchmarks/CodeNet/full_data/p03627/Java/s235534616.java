import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Dmitry on 25.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        //System.out.print("Hello");
        solve();
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //long ans = 0;
        int max1=0;
        int max2 = 0;
        //int i = arr.length-1;
        for(int i = arr.length-1; i>=1;i--){
            if(arr[i-1] == arr[i]){
                if(max1==0){
                    max1 = arr[i];
                    i--;
                }
                else{
                    max2 = arr[i];
                    break;
                }
            }
        }
        long res = max1*max2;
        System.out.println(res);
    }
}
