import java.util.*;

public class Main{
    
    static int[][] lcs = new int[10002][10002];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        int ans = 0;
        for(int i=1; i<=n; i++){
            int tmp = lcs(s.substring(0,i), s.substring(i,n));
            ans = Math.max(ans, tmp);
        }
        
        System.out.println(ans);
    }

    public static int lcs(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
    	if (l1 == 0 || l2 == 0) return 0; // no common strings
		
        for(int[] tmp : lcs)Arrays.fill(tmp, 0);
    	int maxLen = 0;
		
    	for (int i = 0; i < l1; i++) {
      		if (s1.charAt(i) == s2.charAt(0)) {
        		lcs[i][0] = 1;
        		maxLen = 1;
      		} else lcs[i][0] = 0;
    	}
    	for (int i = 0; i < l2; i++) {
      		if (s2.charAt(i) == s1.charAt(0)) {
        		lcs[0][i] = 1;
        		maxLen = 1;
      		} else lcs[0][i] = 0;
    	}
		
    	for (int i = 1; i < l1; i++) {
      		for (int j = 1; j < l2; j++) {
        		if (s1.charAt(i) != s2.charAt(j)){
            		lcs[i][j] = 0;
        		}else{
          			lcs[i][j] = lcs[i-1][j-1] + 1;
          			maxLen = Math.max(lcs[i][j], maxLen);
        		}
      		}
    	}
    	return maxLen;
    }
}
