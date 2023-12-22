import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Main
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
        	String[] s=br.readLine().split(" ");
        	int N = Integer.parseInt(s[0]);
        	int M = Integer.parseInt(s[1]);
        	long ans = ((long)N*(N-1))>>1;
        	ans += ((long)M*(M-1))>>1;
        	System.out.println(ans);
        }
    }
}