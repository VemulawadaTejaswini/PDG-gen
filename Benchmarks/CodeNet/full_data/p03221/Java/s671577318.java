import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] input = new int[M][2];
		for(int i = 0;i < M;++i) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
		}
		sc.close();
		
		Map<Integer, LinkedList<Integer>> map = new HashMap<>();
		for(int i = 0;i < M;++i) {
			if(!map.containsKey(input[i][0])) {
				LinkedList<Integer> cap = new LinkedList<>();
				cap.add(i);
				map.put(input[i][0], cap);
			}else {
				LinkedList<Integer> list = map.get(input[i][0]);
				int left = 0, right = list.size();
				while(left <= right) {
					int j = (left + right)/2;
					if(input[list.get(j)][1] < input[i][1]) {
						if(j+1 > list.size()-1) {
							list.add(i);
							break;
						}else if(input[list.get(j+1)][1] > input[i][1]) {
							list.add(j+1, i);
							break;
						}else {
							left = j+1;
						}
					}else {
						if(j-1 < 0) {
							list.add(0, i);
							break;
						}else if(input[list.get(j-1)][1] < input[i][1]) {
							list.add(j, i);
							break;
						}else {
							right = j-1;
						}
					}
				}
			}
		}
		
		for(Integer i : map.keySet()) {
			LinkedList<Integer> list = map.get(i);
			for(int j = 0;j < list.size();++j) {
				input[list.get(j)][1] = j;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < M;++i)
			sb.append(String.format("%06d%06d\n", input[i][0], input[i][1]+1));
		System.out.println(sb.toString());
	}
}
