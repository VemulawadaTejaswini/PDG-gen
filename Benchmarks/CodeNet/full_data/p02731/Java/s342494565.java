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
        	double L = Double.parseDouble(br.readLine());
        	double length = L/3;
        	L-=length;
        	double breadth = L/2;
        	double height = L - breadth;
        	double result = length*breadth*height;
        	System.out.println(String.format("%.12f",result));
        }
    }
}
