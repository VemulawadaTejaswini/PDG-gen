import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,Integer>hm = new HashMap<Integer, Integer>();
    
       int n = sc.nextInt();
       int maxnum = 0;
       for(int i = 0; i< n ;i++) {
    	  int a = sc.nextInt() - 1;
    	   if(!hm.containsKey(a)) {
    		   hm.put(a, 1);
    	   }
    	   else {
    		   hm.put(a, hm.get(a)+1);
    	   }
    	   maxnum = Math.max(a, maxnum);
       }
       
       int max = 0;
       int []cnt = new int [maxnum+3];
       
       for(int i = 0 ; i <= maxnum ;i++) {
    	   if(hm.get(i) != null) {
    		   cnt[i+2] += hm.get(i);
    		   cnt[i+1] += hm.get(i);
    		   cnt[i] += hm.get(i);
    	   }
       }
       Arrays.sort(cnt);
       
       System.out.println(cnt[maxnum+2]);
	}


}
