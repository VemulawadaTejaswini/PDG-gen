import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
      	int N = sc.nextInt();
      	int M = sc.nextInt();
        int C = sc.nextInt();
      	
      	// 要素M個のBを入力する
        ArrayList<Integer> B = new ArrayList<Integer>();
      	for (int i=0; i<M; i++) {
         	B.add(sc.nextInt()); 
        }
      
      	
      	int total = 0;
      	int count = 0;
      	int A = 0;
      	for (int i=0; i<N; i++) {
          	total = 0;
        	for (int j=0; j<M; j++) {
            	A = sc.nextInt();
              	total += A * B.get(j);
            }
          	total += C;
          	if (total > 0) {
            	count++;
            }
        }
      
      	System.out.println(count);
    }
}