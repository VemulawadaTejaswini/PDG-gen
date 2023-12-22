import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int[] res = new int[len];

        int i = 0;
        while(i < len) {
        	int leftR = i;
        	while(i < len && s.charAt(i) == 'R') {
        		i++;
        	}
        	int rightR = i-1;

        	int leftL = i;
        	while(i < len && s.charAt(i) == 'L') {
        		i++;
        	}
        	int rightL = i - 1;
        	int cntR = rightR - leftR + 1;
        	int cntL = rightL - leftL + 1;
        	int cnt = (cntR + cntL) / 2;
        	res[rightR] = cnt;
        	res[leftL] = cnt;
        	if((cntR + cntL) % 2 != 0) {
        		if(cntR > cntL) {
        			if((cntR-1) % 2 == 0)
        				res[rightR]++;
        			else
        				res[leftL]++;
        		} else {
        			if((cntL-1) % 2 == 0)
        				res[leftL]++;
        			else
        				res[rightR]++;
        		}
        	}
        }
        for(int j = 0; j < len; j++)
        	if(j == len - 1)
        		System.out.println(res[j]);
        	else
        		System.out.print(res[j] + " ");
    }
}
