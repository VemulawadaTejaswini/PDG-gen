import java.io.*;
import java.util.*;

public class Main{

	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public String next(){
			try{
				while(st==null||!st.hasMoreElements()){
					st = new StringTokenizer(br.readLine());
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			return st.nextToken();
	
		}
		public int nextInt(){
			return Integer.parseInt(next());
		}
		public long nextLong(){
			return Long.parseLong(next());
		}
		public double nextDouble(){
			return Double.parseDouble(next());
		}
		public String nextLine(){
			String s = "";
			try{
				s = br.readLine();
			}catch(Exception e){
				e.printStackTrace();
			}	
			return s;		
		}
	} 
	
	public static void main(String[] args){
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n= in.nextInt();
		int[] a = new int[n];
		int[] pre = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
			if(i>0)
			pre[i] = pre[i-1]+a[i];
			else pre[i]=a[i];
		}
		int count=0;		
		for(int i=1;i<n;i++){
			if(pre[i]*pre[i-1]>=0){
				if(pre[i]>=0){
					int temp = pre[i];
					count+=(temp+1);
					for(int j=i;j<n;j++)
					pre[j]+=-(temp+1);
				}
				else{
					int temp = pre[i];
					count+=-(temp-1);
					for(int j=i;j<n;j++){
					pre[j]+=-(temp+1);
					}
				}

			}
		}
		out.println(count);
		out.flush();
		out.close();  
	}

}



