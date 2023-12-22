import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
      
      	int ns[] = new int[n];
      	int qc[] = new int[q];
      
      	for(int i = 0; i < n; i++) ns[i] = k;
      	for(int i = 0; i < q; i++) qc[i] = sc.nextInt();
      
      	for(int i = 0; i < q;i++){
          for(int j = 0; j < n; j++){
            if(qc[i] != (i + 1)) ns[j] -= 1;
          }
        }
		
      	for(int i = 0; i < n; i++){
			if(ns[i] > 0) System.out.println("Yes");
      		else System.out.println("No");
        }
	}
}