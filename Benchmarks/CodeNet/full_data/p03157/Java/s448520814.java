	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int H = sc.nextInt();	
	        int W = sc.nextInt();	
	        int[][]m = new int[H][W];
	        for (int i=0 ; i<H; i++) {
	        	String S = sc.next();
	        	char[] c = S.toCharArray();
	            for(int j=0;j<W;j++) {
	            	if(c[j]=='#')m[i][j]=1;
	            }
	        }
	        long ans=0;
	        boolean[][] visited = new boolean[H][W];
	        for (int i=0 ; i<H; i++) {
	            for(int j=0;j<W;j++) {
	            	if(visited[i][j]==true){
	            		//ans=ans+m[i][j];
	            	} else if(m[i][j]==1) {
	            		int[][] d = new int[H*W][2]; 
	            		LinkedList<Integer> q= new LinkedList<Integer>();
	            		q.add(i*W+j);
	            		int cnt1=0;
	            		int cnt2=1;
	            		visited[i][j]=true;
            			int[] dx = {1, -1, 0, 0};
            			int[] dy = {0, 0, 1, -1};
	            		while(!q.isEmpty()) {
	            			int t = q.poll();
	            			int nh = t/W;
	            			int nw = t%W;
	            			int w = m[nh][nw];
	            			for(int k=0;k<4;k++) {
	            				int nx = nh + dx[k];
	            				int ny = nw + dy[k];
	            				if(nx >= 0 && nx < H && ny >= 0 && ny < W) {
	            					if(w==m[nx][ny])continue;
	            					if(visited[nx][ny]==true)continue;
		            				if(m[nx][ny]==0)cnt1++;
		            				else {
		            					d[cnt2][0]=nx;
		            					d[cnt2][1]=ny;
		            					cnt2++;
		            				}
		            				visited[nx][ny]=true;
		            				q.add(nx*W+ny);
	            				}
	            			}
	            		}
	            		ans=ans+cnt1*cnt2;
/*	            		for(int k=0;k<cnt2;k++) {
	            			m[d[k][0]][d[k][1]]=cnt1;
	            		}*/
	            	}	
	            }	
	        }
	        
	        
	        System.out.println(ans);
	    }
	}