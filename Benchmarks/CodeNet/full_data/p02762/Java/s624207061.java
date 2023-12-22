import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       int  M = sc.nextInt();
       int  K = sc.nextInt();
       
       Unionfind uf = new Unionfind(N);
       
       ans=new int[N];
       
       int [][]like = new int [M][2];
       for (int i=0 ; i<M; i++) {
    	   like[i][0] = Integer.parseInt(sc.next())-1;
    	   like[i][1] = Integer.parseInt(sc.next())-1;
    	   uf.union(like[i][0], like[i][1]);
       }
       
       int [][]dislike = new int [K][2];
       for (int i=0 ; i<K; i++) {
    	   dislike[i][0] = Integer.parseInt(sc.next())-1;
    	   dislike[i][1] = Integer.parseInt(sc.next())-1;
       }
       for(int i=0;i<N;i++) {
    	   ans[i]=uf.getSize(i)-1;
       }
       
       for(int i=0;i<M;i++) {
    	   ans[like[i][0]]--;
    	   ans[like[i][1]]--;
       }
       
       for(int i=0;i<K;i++) {
    	   if(uf.same(dislike[i][0],dislike[i][1])){
        	   ans[dislike[i][0]]--;
        	   ans[dislike[i][1]]--;
    	   }
       }
		for(int i = 0;i<N;i++) {
			System.out.println(ans[i]);
		}
   }
   

}

class Unionfind {
	   
		private int[] data;
		private int []size;
		
		public Unionfind(int size) {
			this.data = new int [size];
			this.size = new int [size];
			for(int i = 0 ;i < size ;i++) {
				initnode(i);
			}
			clear();
		}
		
		public void initnode(int i) {
			size[i] = 1;
		}
		
		public void clear() {
			Arrays.fill(data, -1);
		}
		
		public void union(int x , int y ) {
			if((x = root(x)) != (y = root(y))) {
				if(data[y] < data[x]) {
					final int t = x;
					x = y;
					y = t;
				}
				data[x] += data[y];
				size[root(x)] += size[root(y)];
				data[y] = x;
			}
		}
		
		public int getSize(int i) {
			return size[root(i)];
		}
		
		public int root(int x) {
			if(data[x] < 0) {
				return x;
			}
			else {
				return data[x] = root(data[x]);
			}
		}
		
		public boolean same(int x, int y) {
			return root(x) == root(y);
		}
		
	}