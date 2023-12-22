/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
		    String s=sc.next();char ch[]=s.toCharArray();int n=s.length(),a[]=new int[n],i;
		    for(i=0;i<n;i++)
		       a[i]=1;
		    for(i=0;i<n;i++){
		        if(ch[i]=='9' && a[i]!=0){
		            ch[i]='1';a[i]=0;
		        }
		        else if(ch[i]=='1' && a[i]!=0){
		            ch[i]='9';a[i]=0;
		        }
		    }
		     for(i=0;i<n;i++)
		       System.out.print(ch[i]);
		      System.out.println();
	}
	 static class FastReader{
          BufferedReader in;
          StringTokenizer st;
          public FastReader(){
              in=new BufferedReader(new InputStreamReader(System.in));
          }
          String next(){
              while(st==null || !st.hasMoreElements()){
                  try{
                      st=new StringTokenizer(in.readLine());
                  }
                  catch(IOException e){
                      e.printStackTrace();
                  }
               }
               return st.nextToken();
            }
            int nextInt(){
                return Integer.parseInt(next());
            }
            long nextLong(){
                return Long.parseLong(next());
            }
            double nextDouble(){
                return Double.parseDouble(next());
            }
            String nextLine(){
            String str19 = "";
            try{
                str19 = in.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
             }
            return str19;
        }
      }    
}
