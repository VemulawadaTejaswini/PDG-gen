import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt(); //roads
		int l = s.nextInt(); //railways
		
		int[][] kmap = new int[n][n];
		int[][] lmap = new int[n][n];
		
		for(int x=0;x<k;x++) {
			int from = s.nextInt();
			int to = s.nextInt();
			
			kmap[from-1][to-1] = 1;
			kmap[to-1][from-1] = 1;
		}
		
		for(int x=0;x<l;x++) {
			int from = s.nextInt();
			int to = s.nextInt();
			
			lmap[from-1][to-1] = 1;
			lmap[to-1][from-1] = 1;
		}
		
		for(int x=0;x<n;x++) {
			kmap[x][x] = 1;
			lmap[x][x] = 1;
		}
		
		String build = "";
		
		for(int x=0;x<n;x++) {
			int total = 0;
			
			for(int y=0;y<n;y++) {
				
				if(path(x,y,kmap,0) && path(x,y,lmap,0))
					total++;
			}
			
			build+= total+" ";
		}
		
		out.println(build.trim());
	}
	
	public static boolean path(int from, int to, int[][] a, int depth) {
		if(depth>a.length)
			return false;
		
		if(a[from][to]==1)
			return true;
		
		boolean found = false;
		for(int x=0;x<a.length && !found;x++) {
			if(a[from][x]==1) {
				boolean b = path(x,to,a,depth+1);
				found = b;
			}
		}
		
		return found;
	}
}