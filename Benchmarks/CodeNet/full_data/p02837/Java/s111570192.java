import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.lang.*; 
import java.util.*;

public class Main 
{ 
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
		
	}
public static void main(String[] args) 
	{ 
		FastReader ob=new FastReader(); 
		int n = ob.nextInt(),count=0;
		boolean flag2=false;
		int  arr[][] = new int[n+1][n+1];
		for (int i=0;i<n ;i++ ) {
		    int a = ob.nextInt();
		    boolean flag =false;
		    for(int j=0;j<a;j++){
		        int x = ob.nextInt();
		        int y = ob.nextInt(); 
		        if(y==1){
		            arr[i+1][x]=0;
		            flag2=true;
		        }
		        else {
		            arr[i+1][x]=-1;
		        }
		    }
		}
		if(!flag2){
		    System.out.println(1);
		    return;
		}
		
		for (int i=1;i<n+1 ; i++) {
		    boolean flag =false;
		
		    for(int j=1;j<n+1;j++){
		        if(j!=i && arr[i][j]==0 && arr[j][i]!=0){
		            flag=true;
		            //System.out.println(i+" "+j);
		            break;
		        }
		        
		    }
		    if(!flag){
		        count++;
		        //System.out.println("i "+i);
		        //System.out.println(count);
		    }
		}
		System.out.println(count);
	}
		
	
} 	