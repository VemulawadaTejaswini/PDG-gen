import java.util.*;
class Main{
	 public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int[] s = new int[N];
      	for(int i = 0; i<N-1; i++){
          	int j = sc.nextInt();
        	s[j-1] += 1;
        }
      	for(int i=0; i<N; i++ ) System.out.println(s[i]);
    
    }

}