import java.util.*;
public class Main {
	public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
                
		// get two integers separated with half-width break
		int[] b = new int[a];
		try {
                for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
                }
                catch (Exception e) {
                        ;
                }
		int count = 0;
		
		for (int i = 0; i < a/2; i++) {
			if (b[b[i]-1] == i+1 && b[i] != (i+1))
				count++;
		}
		System.out.println(count);
    }
}