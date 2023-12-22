import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j = 0; j < b; j++) {
              	array.add(a);
              	count++;
              	if(count == K){
                	System.out.print(array.get(K-1));
                  	return;
                }

			}
		}

		


      
	}
}
