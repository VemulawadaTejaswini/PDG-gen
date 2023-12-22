//Contribted By - Rahul Roy
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	
	static long M = (long)1e9+7;
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		int h = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<pair> al = new ArrayList<>();
		for(int i=0;i<n;i++){
			pair p = new pair();
			p.health = sc.nextInt();
			p.cost = sc.nextInt();
			al.add(p);
		}
		int dp[] = new int[h+1];
		int mark[] = new int[h+1];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[h]=0;
		mark[h]=1;
		for(int i=h;i>=1;i--){
			for(int j=0;j<n;j++){
				if(mark[i]==1){
					pair p = al.get(j);
					dp[Math.max(0,i-p.health)] = Math.min(dp[Math.max(0,i-p.health)], dp[i]+p.cost);
					mark[Math.max(0,i-p.health)]=1;
				}
			}
		}
		System.out.println(dp[0]);
	}
	
	public static class pair{
		int health =0 ;
		int cost = 0;
	}
	
	
	
	
		
		
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;


		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
}
/* class Triplet{
	int threeSumClosest(ArrayList<Integer> arr, int target) {
        int flag=0,n = arr.size();
        int res=0;
        
        Collections.sort(arr);
		
        for(int i = 0 ; i < n-2 ; ++ i ) {  
            
            int j = i+1, k = n-1;
            
            while(j<k) {
                int sum=arr.get(i)+arr.get(j)+arr.get(k);   // get the sum of the triplet
                
                if(flag==0){  // if its your 1st triplet updated res
                    res=sum;
                    flag=1;
                }
                
                if(Math.abs(sum-target)<=Math.abs(res-target)) {   // compare the difference if sum is closer to target then res
                    if(Math.abs(sum-target)==Math.abs(res-target)){
                        if(res<sum)
                            res=sum;
                    }
                    else
                        res=sum;
                }
                
                if(target>sum)  // if sum is smaller than target
                    j++;
                else        // if sum is greater than target
                    k--;
            }
        }
        return res; // return the answer 
    }
} */