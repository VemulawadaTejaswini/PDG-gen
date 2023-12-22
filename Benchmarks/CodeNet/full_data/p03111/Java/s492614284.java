import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	static int count = 3;
	static int N;
	static boolean[] mainMap;
	static int[] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		mainMap = new boolean[N];
		
		int[] map = new int[3];
		for (int i = 0; i < 3; i++) {
			map[i] = sc.nextInt();
		}
		
		map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			int minMp = Integer.MAX_VALUE;
			Min min = null;
			for (int j = 0; j < 3; j++) {
				if (map[j] == -1) 
					continue;
				
				Min m = minMp(map[j]);
				if (minMp > m.useMp) {
					minMp = m.useMp;
					min = m;
				}
			}
			
			map[min.type] = -1;
			ans += min.useMp;
			count--;
			for (int j = 0; j < N; j++) {
				mainMap[j] |= min.map[j];
			}
		}
		
		System.out.println(ans);
	}
	
	
	static Min minMp(int num) {
		Min minObj = new Min(num);
		int min = Integer.MAX_VALUE;
		int index = -1;
		boolean[] memo = Arrays.copyOf(mainMap, N);
		
		//加減
		for (int i = 0; i < N; i++) {
			if (memo[i])
				continue;
			
			int calc = Math.abs(num - map[i]);
			if (min > calc) {
				index = i;
				min = calc;
			}
		}
		
		if (min == 0) {
			minObj.useMp = min;
			minObj.map[index] = true;
			return minObj;
		}
		
		boolean change = false;
		while(true) {
			int i1 = -1, i2 = -1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (i == j || mainMap[i] || mainMap[j])
						continue;
					
					int sum = map[i] + map[j];
					int calc = Math.abs(num - sum);
					if (min > calc) {
						min = calc;
						i1 = i;
						i2 = j;
						change = true;
					}
				}
			}
			
			if (min == 0) {
				minObj.useMp = min;
				minObj.map[i1] = true;
				minObj.map[i2] = true;
				return minObj;
			}
			
			if (!change) {
				minObj.useMp = min;
				minObj.map = memo;
				minObj.map[index] = true;
				break;
			}
			
			memo[i1] = true;
			memo[i2] = true;
			
			
			for (int i = 0; i < N; i++) {
				if (memo[i])
					continue;
				
				int calc = Math.abs(num - (min + map[i]));
				if (min > calc) {
					index = i;
					min = calc;
				}
			}
			
			if (min == 0) {
				minObj.useMp = min;
				minObj.map = memo;
				minObj.map[index] = true;
				return minObj;
			}
		}
		
		return minObj;
	}
	
	static class Min {
		int useMp;
		int type;
		boolean[] map;
		
		Min(int type) {
			this.type = type;
			this.useMp = 0;
			this.map = new boolean[N];
		}
	}
}
