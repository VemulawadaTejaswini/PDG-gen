import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int flower[] = new int[100];
		int flower_h[] = new int[100];
		int num = sc.nextInt();
		int diff = 0;
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			flower_h[i] = sc.nextInt();
		}
		
		if(num == 1) {
			System.out.println(flower_h[0]);
			return;
		}
	
		while(isHeight(flower,num)) {
			for(int i = 0; i < num; i++) {
				
				//現在の花の高さが既に同じの場合はスキップ
				if(flower_h[i] == flower[i] || flower_h[i] == 0) continue;
				
				//水やり
				flower[i]++;
				
				//右端の場合はbreak
				if(i == num -1 ) break;
				
				//右隣の高さが同じの場合はbreak;
				if(flower_h[i+1] == flower[i+1]) break;

			}
			count++;
		}
		
		System.out.println(count);

	}
	
	public static boolean isHeight(int[] flower, int len) {
		
		for(int i = 0; i < len; i++) {
			if(flower[i] != flower[i+1]) {
				return false;
			}
		}
		return true;
	}
}

