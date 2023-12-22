import java.io.*;
import java.util.*;
public class Main {
	static int id=1;
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int h=sc.nextInt();
		int w=sc.nextInt();
		String  s[]=new String[h];
		for (int k=0;k<h;k++) {
			s[k]=sc.next();
		}
		int imf[][]=new int[h][w];
		for(int x=0;x<h;x++) {
			for(int y=0;y<w;y++) {
				imf[x][y]=0;
			} 
		}	
		int num[][]=new int[h*w+1][2];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(imf[i][j]==0) {
					create(num,imf,s,i,j,h,w,id);
					id++;
				}
			}
		}
		
		long ans=0;
		for (int a=1;a<=id-1;a++) {
			ans+=num[a][0]*num[a][1];
			
		}
		System.out.println(ans);
		
		
		}
		
	public static void create(int[][] num,int[][] imf,String[] s,int i,int j,int h,int w,int id) {
		//id is local
		
		if(s[i].charAt(j)=='#') {
			num[id][0]++;
		}
		else {
			num[id][1]++;
		}
		imf[i][j]=id;
			if(j!=w-1&&s[i].charAt(j+1)!=s[i].charAt(j)&&imf[i][j+1]==0) { 
	
				create(num,imf,s,i,j+1,h,w,id);
				
			}
			if(i!=h-1&&s[i+1].charAt(j)!=s[i].charAt(j)&&imf[i+1][j]==0) {
		
				create(num,imf,s,i+1,j,h,w,id);
				
			}
			if(j!=0&&s[i].charAt(j-1)!=s[i].charAt(j)&&imf[i][j-1]==0) { 
				
				create(num,imf,s,i,j-1,h,w,id);
				
			}
			if(i!=0&&s[i-1].charAt(j)!=s[i].charAt(j)&&imf[i-1][j]==0) {
			
				create(num,imf,s,i-1,j,h,w,id);
				
			}
			
	}
	
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}



