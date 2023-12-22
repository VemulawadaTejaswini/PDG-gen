import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] map = new int[N];
        for (int i = 0; i < N; i++) {
        	map[i] = sc.nextInt();
        }
        
        Arrays.sort(map);
        
        int a = 0;
        int b = 0;
        for (int i = 0; i < N; i++) {
        	if (i % 2 == 0) {
        		a+=map[i];
        	} else {
        		b+=map[i];
        	}
        }
        
        System.out.println(Math.abs(a-b));
    }
    
}