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
    public static boolean isPalindrome(String s , int start,int end){
    	while(start<end){
    		if(s.charAt(start)!=s.charAt(end))
    			return false;
    		start++;
    		end--;
    	}
    	return true;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        tc=1;
        t:
        for(int z=1;z<=tc;z++){
        	String s = br.readLine();
        	boolean result =true;
        	result = isPalindrome(s,0,s.length()-1);
        	if(!result){
        		System.out.println("No");
        		return;
        	}
        	result = isPalindrome(s,0,(s.length()-2)>>1);
        	if(!result){
        		System.out.println("No");
        		return;
        	}
        	result = isPalindrome(s,(s.length()+2)>>1,s.length()-1);
        	if(!result){
        		System.out.println("No");
        		return;
        	}
        	System.out.println("Yes");
        }
    }
}
