/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static List<String> al=new ArrayList<>();
	
	static void permute(String str, int l, int r) 
    { 
        if (l == r) 
            al.add(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
    public static double distance(int a,int b,int x,int y){
    	return Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=1;
		t:
		while(tc-->0){
			int n=Integer.parseInt(br.readLine());
			int[][] towns=new int[n][2];
			for(int i=0;i<n;i++){
				String[] s=br.readLine().split(" ");
				towns[i][0]=Integer.parseInt(s[0]);
				towns[i][1]=Integer.parseInt(s[1]);
			}
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<n;i++){
				sb.append(i);
			}
			permute(sb.toString(),0,n-1);
			double[] tot=new double[al.size()];
			for(int i=0;i<al.size();i++){
				String a=al.get(i);
				for(int j=0;j<a.length()-1;j++){
					tot[i]+=distance(towns[Integer.parseInt(a.substring(j,j+1))][0],towns[Integer.parseInt(a.substring(j,j+1))][1],towns[Integer.parseInt(a.substring(j+1,j+2))][0],towns[Integer.parseInt(a.substring(j+1,j+2))][1]);
				}
			}
			double answer=0.0;
			for(int i=0;i<tot.length;i++){
				answer+=tot[i];
			}
			answer/=al.size();
			System.out.printf("%.10f\n",answer);
		}
	}
}