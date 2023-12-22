import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static boolean[] visited ;
	static int dis;
	static int[] point;
	static int stepNum;
	static int result = Integer.MAX_VALUE; 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		stepNum = sc.nextInt();
		point = new int[num+1];
		boolean flag = true;
		int start = -1;
		
		visited = new boolean[point.length];
		
		for(int i = 0 ; i < point.length; i++){
			int temp = sc.nextInt();
			if(temp > 0 && flag){
				point[i] = 0;
				start = i;
				i++;
				flag = false;
			}
			point[i] = temp;
		}
		visited[start] = true;
		
		findMinDis(0,start,0);
		System.out.println(result);
	}
	
	public static int findMinDis(int dist, int start, int step) {
		
		List<Integer> adj = findAdj(start);
		if(step == stepNum) {
			if (result > dist) {
				result = dist;
			}
			return dist;
		}
		
		for(int i = 0; i < adj.size(); i++){
			dist +=  Math.abs(adj.get(i)-point[start]);
			step++;
			int index = findIndex(adj.get(i));
			visited[index] = true;
			findMinDis(dist, index, step);
			dist -=  Math.abs(adj.get(i)-point[start]);
			step--;
			visited[index] = false;
		}
		
		return dist;
	}
	
	public static List<Integer> findAdj(int Strat) {
		List<Integer> list = new ArrayList<Integer>();
		for(int j = Strat; j >= 0 ; j--){
			if(!visited[j]){
				list.add(point[j]);
				break;
			}
		}
		for(int j = Strat+1; j < point.length ; j++){
			if(!visited[j]){
				list.add(point[j]);
				break;
			}
		}
		return list;
	}
	
	public static int findIndex(int val){
		for(int i = 0; i < point.length; i++) {
			if(val == point[i]) {
				return i;
			}
		}
		return -1;
	}
	
}
