import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int i =0; i< n; i++) {
        	int x = in.nextInt();
        	if(x>=0) pos.add(x);
        	else neg.add(0,Math.abs(x));
        }  
        
        int min=Integer.MAX_VALUE;
        if(pos.size()>=k)
        	min = Math.min(min, pos.get(k-1));
        if(neg.size()>=k)
        	min = Math.min(min, neg.get(k-1));

        for(int i =0; i< pos.size() && i<k; i++) {
        	int left = k-i-1;
        	if(neg.size()>=left && left>0) {
        		int a = pos.get(i);
        		int b = neg.get(left-1);
        		min= Math.min(min , Math.min(2*a+b, 2*b+a));
        	}
        }
        System.out.println(min);
    }
}
