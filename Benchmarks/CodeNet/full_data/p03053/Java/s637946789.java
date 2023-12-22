	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int[][] visited = new int[H][W];
	        LinkedList<Integer> p= new LinkedList<Integer>();
	        int cnt=0;
	        for(int i=0;i<H;i++) {
	        	String S = sc.next();
	        	char[] c = S.toCharArray();
	        	for(int j=0;j<W;j++) {
	        		if(c[j]=='#') {
	        			visited[i][j]++;
	        	        p.add(i);
	        	        p.add(j);
	        	        p.add(1);
	        	        cnt++;
	        		}
	        	}
	        }
	        
	        long ans=0;
	        while(!p.isEmpty()) {
	        	cnt++;
	        	if(cnt>H*W)break;
	        	int h=p.poll();
	        	int w=p.poll();
	        	int d=p.poll();
	        	ans=Math.max(ans, d);
	        	visited[h][w]=d;
	        	if(h<H-1&&visited[h+1][w]==0) {
	        		p.add(h+1);
	        		p.add(w);
	        		p.add(d+1);
	        	}
	        	if(h>0&&visited[h-1][w]==0) {
	        		p.add(h-1);
	        		p.add(w);
	        		p.add(d+1);
	        	}
	        	if(w>0&&visited[h][w-1]==0) {
	        		p.add(h);
	        		p.add(w-1);
	        		p.add(d+1);
	        	}
	        	if(w<W-1&&visited[h][w+1]==0) {
	        		p.add(h);
	        		p.add(w+1);
	        		p.add(d+1);
	        	}
	        }
	        
	        
	        System.out.println(ans-1);
	    }
	}