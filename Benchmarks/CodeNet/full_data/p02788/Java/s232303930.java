//Contribted By - Rahul Roy
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	
	static long M = (long)1e9+7;
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long d = sc.nextLong();
		long a = sc.nextLong();
		ArrayList<pair> al = new ArrayList<>();
		for(int i=0;i<n;i++){
			pair p = new pair();
			p.x = sc.nextLong();
			p.health = sc.nextLong();
			al.add(p);
		}
		
		Collections.sort(al, new comp());
		long count = 0 ;
		long farrange = 0;
		long currdrop =0 ;
		for(int i=0;i<n;i++){
			pair p = al.get(i);
			if(p.x<=farrange){
				if(p.health-(currdrop*a)<=0){
					
				}else{
					p.health = p.health-(currdrop*a);
					
					currdrop = (p.health/a) + (p.health%a==0 ? 0 : 1);
					farrange = p.x+(2*d);
					count+=currdrop;
				}
			}else{
				currdrop = (p.health/a) + (p.health%a==0 ? 0 : 1);
				farrange = p.x+(2*d);
				count+=currdrop;
			}
		}
		System.out.println(count);
	}
	
	public static class pair{
		long x = 0;
		long health = 0 ;
	}
	
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return Long.valueOf(o1.x).compareTo(Long.valueOf(o2.x));
		}
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