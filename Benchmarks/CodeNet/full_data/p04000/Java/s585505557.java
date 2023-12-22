import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * https://abc045.contest.atcoder.jp/tasks/arc061_b
 */
public class Main {

	static Map<String,Point> map = new HashMap<>();
	static Set<String> checked = new HashSet<>();
	static long H;
	static long W;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		H = Long.parseLong(sc.next());
		W = Long.parseLong(sc.next());
		int N = Integer.parseInt(sc.next());
		for(int i=0; i<N; i++){
			Point p = new Point(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
			map.put(getKey(p.x,p.y), p);
		}
		sc.close();
		
		long[] ans = new long[10];
		for(Point p:map.values()){
			for(int x=0; x<=2; x++){
				for(int y=0; y<=2; y++){
					int count = count(p.x-x,p.y-y);
					if(count>0){
						ans[count]++;
					}
				}
			}
		}
		long sum = 0;
		for(int i=1; i<=9; i++){
			ans[i] = ans[i]/i;
			sum+=ans[i];
		}
		ans[0] = (H-2)*(W-2)-sum;
		for(long a:ans){
			System.out.println(a);
		}
	}
	
	static int count(int x, int y){
		int count = 0;
		//if(checked.contains(getKey(x,y))) return -1;
		if( x<=0 || y<=0 || x>W-2 || y>H-2 ) return -1;
		for(int i=0; i<=2; i++){
			for(int j=0; j<=2; j++){
				if(map.containsKey(getKey(x+i,y+j))){
					count++;
				}
			}
		}
		//checked.add(getKey(x,y));
		return count;
	}
	
	static String getKey(int x, int y){
		return x+"."+y;
	}
	
	static class Point{
		int x;
		int y;
		Point(int y, int x){
			this.x = x;
			this.y = y;
		}
	}

}