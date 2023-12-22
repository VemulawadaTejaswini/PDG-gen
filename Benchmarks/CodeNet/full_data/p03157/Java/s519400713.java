import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int ans = 0;
	static int[] dw = {1,0,-1,0};
    static int[] dh = {0,1,0,-1};
    static Queue<Point> queue = new ArrayDeque<>();
    static ArrayList<String> Sh = new ArrayList<>(450);
    static int H;
    static int W;
    static int reachedB;
    static int[][] reached = new int[500][500];
    static int[][] reachedBlack = new int[500][500];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        for(int i=0;i<H;i++) {
        	Sh.add(sc.next());
        }
        
         
        for(int i=0;i<W;i++) {
        	for(int j=0;j<H;j++) {
        		if(Sh.get(j).charAt(i) == '#' && reachedBlack[j][i] ==0) {
        			queue.offer(new Point(j,i));
        			reachedB=0;
        			for(int a=0;a<H;a++) {
        				Arrays.fill(reached[a], 0);
        			}
        			bfs();
//        			System.out.println("bbbb  " + queue.poll());
        		}
        	}
        }
        
        System.out.println(ans);
        
        sc.close();
    }
    
    public static void bfs() {
//    	System.out.println("BFS!!  " + queue.peek());
    	while(queue.peek()!=null) {
	    	Point p = queue.poll();
	    	if(p == null) {
	    		return;
	    	}
//	    	System.out.println("(" + p.x + "," + p.y + ")"  + " = " + Sh.get(p.x).charAt(p.y));
	    	if(Sh.get(p.x).charAt(p.y)=='#') {
	    		for(int k=0;k<4;k++) {
	    			if(p.x+dh[k] > H-1 || p.x+dh[k] < 0 || p.y+dw[k] > W-1 || p.y+dw[k] <0) {
	    				continue;
	    			}
	    			if(reached[p.x+dh[k]][p.y+dw[k]] == reachedB) continue;
					if(Sh.get(p.x+dh[k]).charAt(p.y+dw[k]) == '.') {
						queue.offer(new Point(p.x+dh[k],p.y+dw[k]));
						ans++;	
						reached[p.x+dh[k]][p.y+dw[k]] += (reachedB - reached[p.x+dh[k]][p.y+dw[k]]);
						reachedBlack[p.x+dh[k]][p.y+dw[k]]++;
					}
				}
	    	}else {
	    		for(int k=0;k<4;k++) {
	    			if(p.x+dh[k] > H-1 || p.x+dh[k] < 0 || p.y+dw[k] > W-1 || p.y+dw[k] <0) {
	    				continue;
	    			}
	    			if(reached[p.x+dh[k]][p.y+dw[k]] > 0) continue;
					if(Sh.get(p.x+dh[k]).charAt(p.y+dw[k]) == '#') {
						queue.offer(new Point(p.x+dh[k],p.y+dw[k]));
					}
				}
	    	}
	    	bfs();
    	}
    	
    }
}
