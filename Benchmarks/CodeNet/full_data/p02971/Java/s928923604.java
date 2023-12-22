import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] map = new int[N];
        int[] src = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
			src[i] = map[i];
		}

		Arrays.sort(map);
		
		for (int i = 0; i < N; i++) {
			if (src[i] == map[N-1]) {
				System.out.println(map[N-2]);
			} else {
				System.out.println(map[N-1]);
			}	
		}
		
    }
}