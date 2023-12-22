import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] ary = new Integer[n];
        int ans = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            ary[i]=sc.nextInt();
            sum += ary[i];
        }
        Arrays.sort(ary,Collections.reverseOrder());
        if(sum%(4*m)==0){
            sum = sum/(4*m);
        } else {
            sum = sum/(4*m)+1;
        }
        for(int i = 0;i<m;i++){
            if(ary[i]>=sum){
                ans ++;
            }
        }
        if (ans>=m){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}