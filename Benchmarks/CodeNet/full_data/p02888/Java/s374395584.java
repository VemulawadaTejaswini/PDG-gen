import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];

        for (int i=0; i<n; i++) l[i] = sc.nextInt();
        Arrays.sort(l);
        int ans = 0;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                int lower = j;
                int upper = n;
                while (lower+1<upper){
                    int mid = (lower+upper)/2;
                    if (l[mid]<l[i]+l[j]){
                        lower = mid;
                    }else {
                        upper = mid;
                    }
                }
                ans += (lower-j);
            }
        }
        System.out.println(ans);
    }
}