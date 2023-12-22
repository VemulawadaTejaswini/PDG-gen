import java.util.*;
public class Main {
	
	static int H;
	static int W;
	static int[][] ruiseki;
	static char[][] map;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        
        map = new char[H][W];
        for (int i = 0; i < H; i++) {
        	map[i] = sc.next().toCharArray();
        }
        
        ruiseki = new int[H][W];
        for (int i = 0; i < H; i++) {
        	for (int j = 0; j < W; j++) {
        		if (map[i][j] == '#') {
        			int sum = 0;
        			if (i - 1 >= 0 && map[i-1][j] == '.') {
        				sum++;
        			}
        			
        			if (i + 1 < H && map[i+1][j] == '.') {
        				sum++;
        			}
        			
        			if (j - 1 >= 0 && map[i][j-1] == '.') {
        				sum++;
        			}
        			
        			if (j + 1 < W && map[i][j+1] == '.') {
        				sum++;
        			}
        			ruiseki[i][j] = sum;
        		}
        	}
        }
        
        long ans = 0;
        for (int i = 0; i < H; i++) {
        	for (int j = 0; j < W; j++) {
        		if (map[i][j] == '#' && ruiseki[i][j] > 0) {
        			ans += dfs(i,j, new Priper(ruiseki[i][j])).calcSum();
        		}
        	}
        }
        
        System.out.println(ans);
    }
    
    static Priper dfs(int h, int w, Priper p) {
    	map[h][w] = '.';
    	p.count++;
    	
    	if (h-1 >= 0 && w-1 >= 0 && map[h-1][w-1] == '#' && ruiseki[h-1][w-1] > 0) {
    		int siro = 0;
    		siro += map[h-1][w] == '.' ? 1 : 0;
    		siro += map[h][w-1] == '.' ? 1 : 0;
    		p.sum += ruiseki[h-1][w-1] - siro;
    		dfs(h-1,w-1, p);
    	}
    	
    	if (h-1 >= 0 && w+1 < W && map[h-1][w+1] == '#' && ruiseki[h-1][w+1] > 0) {
    		int siro = 0;
    		siro += map[h-1][w] == '.' ? 1 : 0;
    		siro += map[h][w+1] == '.' ? 1 : 0;
    		p.sum += ruiseki[h-1][w+1] - siro;
    		dfs(h-1,w+1, p);
    	}
    	
    	if (h+1 < H && w-1 >= 0 && map[h+1][w-1] == '#' && ruiseki[h+1][w-1] > 0) {
    		int siro = 0;
    		siro += map[h+1][w] == '.' ? 1 : 0;
    		siro += map[h][w-1] == '.' ? 1 : 0;
    		p.sum += ruiseki[h+1][w-1] - siro;
    		dfs(h+1,w-1, p);
    	}
    	
    	if (h+1 < H && w+1 < W && map[h+1][w+1] == '#' && ruiseki[h+1][w+1] > 0) {
    		int siro = 0;
    		siro += map[h+1][w] == '.' ? 1 : 0;
    		siro += map[h][w+1] == '.' ? 1 : 0;
    		p.sum += ruiseki[h+1][w+1] - siro;
    		dfs(h+1,w+1, p);
    	}
    	
    	return p;
    }
    
    static class Priper {
    	long sum;
    	long count;
    	
    	public Priper (int start) {
    		this.sum = start;
    	}
    	
    	public long calcSum() {
    		return this.sum * this.count;
    	}
    }
}