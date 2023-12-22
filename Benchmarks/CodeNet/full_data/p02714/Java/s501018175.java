import java.util.*;
public class Main
{
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        String s = scan.nextLine();
        char[] sCh = s.toCharArray();
        long sum = 0;
        
        for (int i = 1; i <= n; i++) {
        	for (int j = i; j <= n; j++) {
        		for (int k = j; k <= n; k++) {
        			if ((j - i) != (k - j) && sCh[i - 1] != sCh[j - 1] && sCh[j - 1] != sCh[k - 1] && sCh[i - 1] != sCh[k - 1]) sum ++;
        		}
        	}
        }
        System.out.println(sum);
    }
}