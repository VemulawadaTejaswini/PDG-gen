import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int N = Integer.parseInt(br.readLine());
           int f=0,s=0,e=0;
           int a1,a2,a3;
           String[] x;
           for(int i=0;i<N;++i){
               x = br.readLine().split("\\s");
               a1 = Integer.parseInt(x[0]);
               a2 = Integer.parseInt(x[1]);
               a3 = Integer.parseInt(x[2]);
               
               int n1,n2,n3;
               
                n1 = a1 + Math.max(s,e);
                n2 = a2 + Math.max(f,e);
                n3 = a3 + Math.max(s,f);
                
                f = n1;
                s = n2;
                e = n3;
               
               
               
               
               
           }
           
           System.out.println(Math.max(f,Math.max(s,e)));
	}
}