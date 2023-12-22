import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
		int q= sc.nextInt();
      	String s = sc.next();

        int[] sum = new int[s.length()];
        sum[0] = 0;
        for (int i =1; i<n; i++) {
            if (s.charAt(i-1) == 'A' && s.charAt(i) == 'C') {
                sum[i] = sum[i-1] + 1;
            }
            else {
                sum[i] = sum[i-1];
            }
        }
                               
        for (int i =0; i<q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            int result = sum[r-1] - sum[l-1];
            System.out.println(result);
        }
        sc.close();
    }


}