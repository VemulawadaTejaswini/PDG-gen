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
	        //boolean[][] svisited = new boolean[H][W];
	        for (int i=0 ; i<H; i++) {
	            for(int j=0;j<W;j++) {
	            	if(m[i][j]==1) {
	        	        boolean[][] visited = new boolean[H][W];
	            		int[][] d = new int[H*W][2]; 
	            		LinkedList<Integer> q= new LinkedList<Integer>();
	            		q.add(i*W+j);
	            		q.add(1);
	            		int cnt1=0;
	            		int cnt2=0;
	            		visited[i][j]=true;
	            		while(!q.isEmpty()) {
	            			int t = q.poll();
	            			int nh = t/W;
	            			int nw = t%W;
	            			int w = q.poll();
	            			if(nh>0) {
	            				if(w%2!=m[nh-1][nw]&&visited[nh-1][nw]!=true) {
		            				visited[nh-1][nw]=true;
		            				if(m[nh-1][nw]==0)cnt1++;
		            				else {
		            					d[cnt2][0]=nh-1;
		            					d[cnt2][1]=nw;
		            					cnt2++;
		            				}
		            				q.add((nh-1)*W+nw);
		            				q.add((w+1)%2);	            					
	            				}
	            				
	            			}
	            			if(nh<H-1) {
	            				if(w%2!=m[nh+1][nw]&&visited[nh+1][nw]!=true) {
		            				visited[nh+1][nw]=true;
		            				if(m[nh+1][nw]==0)cnt1++;
		            				else {
		            					d[cnt2][0]=nh+1;
		            					d[cnt2][1]=nw;
		            					cnt2++;
		            				}
		            				q.add((nh+1)*W+nw);
		            				q.add((w+1)%2);	            					
	            				}
	            			}
	            			if(nw>0) {
	            				if(w%2!=m[nh][nw-1]&&visited[nh][nw-1]!=true) {
		            				visited[nh][nw-1]=true;
		            				if(m[nh][nw-1]==0)cnt1++;
		            				else {
		            					d[cnt2][0]=nh;
		            					d[cnt2][1]=nw-1;
		            					cnt2++;
		            				}
		            				q.add(nh*W+nw-1);
		            				q.add((w+1)%2);	            					
	            				}
	            			}
	            			if(nw<W-1) {
	            				if(w%2!=m[nh][nw+1]&&visited[nh][nw+1]!=true) {
		            				visited[nh][nw+1]=true;
		            				if(m[nh][nw+1]==0)cnt1++;
		            				else {
		            					d[cnt2][0]=nh;
		            					d[cnt2][1]=nw+1;
		            					cnt2++;
		            				}
		            				q.add(nh*W+nw+1);
		            				q.add((w+1)%2);
		            			}	            					
	            			}
	            		}
	            		ans=ans+cnt1;
	            		for(int k=0;k<cnt2;k++) {
	            			m[d[k][0]][d[k][1]]=cnt1;
	            		}
	            		
	            	} else if(m[i][j]>1){
	            		ans=ans+m[i][j];
	            	}
	            }	
	        }
	        
	        
	        System.out.println(ans);
	    }
	}