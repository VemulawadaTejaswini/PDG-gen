import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		ArrayList<int[]> ab = new ArrayList<int[]>();
		for(int i = 0; i < M; i++){
			int[] edge = {in.nextInt(), in.nextInt()};
			ab.add(edge);
		}
		
		//ab.sort((a1,a2)->a1[1]-a2[1]);
		Collections.sort(ab, new edgeComparator());
		
		/*
		for(int i = 0; i < M; i++){
			int[] edge = ab.get(i);
			int a = edge[0];
			int b = edge[1];
			System.out.println(a + " " + b);
		}
		*/
		
		
		int ans = 0;
		int preVisitedIndex = 0;
		
		for(int i = 0; i < M; i++){
			int[] edge = ab.get(i);
			int a = edge[0];
			int b = edge[1];
			
			if(preVisitedIndex >= a && preVisitedIndex < b)
				continue;
			
			preVisitedIndex = b - 1;
			ans++;
		}
		
		System.out.println(ans);
	}
	
	public static class edgeComparator implements Comparator<int[]> {

		@Override
		public int compare(int[] e1, int[] e2) {
			return e1[1] - e2[1];
		}
	}
}