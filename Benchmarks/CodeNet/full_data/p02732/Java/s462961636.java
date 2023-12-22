import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int tc=1;
    static String[] s;

    public static long[] ila(String[] s){
        long[] array=new long[s.length];
        for(int i=0;i<array.length;i++)
            array[i]=Long.parseLong(s[i]);
        return array;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        tc=1;
        t:
        for(int z=1;z<=tc;z++){
        	int n = Integer.parseInt(br.readLine());
        	HashMap<Integer,Integer> hm=new HashMap<>();
        	String[] s=br.readLine().split(" ");
        	for(int i=0;i<n;i++){
        		int x = Integer.parseInt(s[i]);
        		if(hm.containsKey(x))
        			hm.put(x,hm.get(x)+1);
        		else
        			hm.put(x,1);
        	}
        	long ans = 0;
        	for(Map.Entry<Integer,Integer> x : hm.entrySet()){
        		int val = x.getValue();
        		if(val > 1 )
        		ans += ((long)val * (val - 1))>>1;
        	}
        	long actual =0;
        	long calculate=0;
        	for(int i=0;i<n;i++){
        		int x = Integer.parseInt(s[i]);
        		int val = hm.get(x);
        		if(val==1){
        		System.out.println(ans);
        		continue;
        		}
        		actual = ((long)val * (val - 1))>>1;
        		if(val==2){
        		System.out.println(ans-actual);
        		continue;
        		}
        		calculate = ((long)(val-1) * (val - 2))>>1;
        		System.out.println(ans-actual+calculate);
        	}
        }
    }
}
