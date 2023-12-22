import java.util.Arrays;
import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[] l = new int[n];

    public static void main(String[] args){
        for (int i=0; i<n; i++) l[i] = sc.nextInt();
        Arrays.sort(l);
        int ans = 0;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                int lower = j;
                int tmp = binarySearch(i, lower);
                ans += tmp;
            }
        }
        System.out.println(ans);
    }

    private static int binarySearch(int s, int t){
        int begin = s;
        int lower = t;
        int upper = n;
        while (lower+1<upper){
            int mid = (lower+upper)/2;
            if (l[mid]<l[begin]+l[lower]){
                lower = mid;
            }else {
                upper = mid;
            }
        }
        return lower-t;
    }
}