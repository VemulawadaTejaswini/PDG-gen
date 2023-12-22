import java.util.ArrayList;
import java.util.HashMap;
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
		
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		for(int i = 0;i < M;++i) {
			if(!map.containsKey(input[i][0])) {
				ArrayList<Integer> cap = new ArrayList<>();
				cap.add(i);
				map.put(input[i][0], cap);
			}else {
				ArrayList<Integer> list = map.get(input[i][0]);
				int left = 0, right = list.size();
				while(true) {
					int j = (left + right)/2;
					if(input[list.get(j)][1] < input[i][1]) {
						if(j+1 >= list.size()-1) {
							list.add(i);
							break;
						}else if(input[list.get(j+1)][1] > input[i][1]) {
							list.add(j+1, i);
							break;
						}else {
							left = j+1;
						}
					}else {
						if(j-1 <= 0) {
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
			ArrayList<Integer> list = map.get(i);
			for(int j = 0;j < list.size();++j) {
				input[list.get(j)][1] = j;
			}
		}
		
		for(int i = 0;i < M;++i)
			System.out.println(String.format("%06d%06d", input[i][0], input[i][1]+1));
	}
}
