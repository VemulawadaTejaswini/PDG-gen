import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();

        long singleCnt = 0;
        boolean flag = false;
        for(int i = 1; i < s.length(); i++) {
        	if(s.charAt(i) == s.charAt(i-1)) {
        	    if(i == s.length()-1) flag = true;
        		singleCnt++;
        		i++;
        	}
        }
        if(s.charAt(0) == s.charAt(s.length()-1) && !flag) singleCnt++;

        long cnt = k * singleCnt;
        if(s.length() > 2 && s.charAt(0) == s.charAt(s.length()-1) && !flag)
            cnt--;
        System.out.println(cnt);
    }
}
