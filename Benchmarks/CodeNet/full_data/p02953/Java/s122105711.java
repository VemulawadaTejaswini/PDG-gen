import java.util.*;


import java.io.*;
 

 
 
public class Main 
{   
	
	
	public static void main(String[] args) throws IOException 
	{ 
		
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer s=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(s.nextToken());
		
		int a[]=new int[n];
		
		s=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
						
			a[i]=Integer.parseInt(s.nextToken());
			
		}
		
		int min[]=new int[n];
		
		min[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--) {
			min[i]=Math.min(a[i], min[i+1]);
		}
//		for(int i=0;i<n;i++) {
//			pw.println(min[i]);
//		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]-min[i]>1) {
				pw.println("No");
				pw.close();
			}
		}
		pw.println("Yes");
		pw.close();
		
		
	}

}