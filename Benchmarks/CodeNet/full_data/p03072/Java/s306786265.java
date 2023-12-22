import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        int[] mountains = new int[N];
        for (int i = 0; i < N; i++) {
            mountains[i] = sc.nextInt();
        }
        
        int max = 0;
        int count = 0;
        
        for (int i = 0; i < N; i++) {
        	
        	if (max >= mountains[i]) {
        		count++;
        		max = mountains[i];	
        	}
        }

		
		System.out.println(count);
	}
}