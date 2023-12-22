import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
      
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
		
        int max_first = 0;
        int max_second = 0;
        int count_max_first = 0;
      
        for(int i = 0; i < N; i++){
            if(A[i] > max_first){
                max_first = A[i];
            }
        } 
      
        for(int i = 0; i < N; i++){
            if(A[i] > max_second && A[i] != max_first){
                max_second = A[i];
            } else if(A[i] == max_first) {
                count_max_first++;
            }
        } 
      
        if(count_max_first > 1){
            max_second = max_first;
        }
      
        for(int i = 0; i < N; i++){
            if(A[i] == max_first){
                System.out.println(max_second);
            } else {
                System.out.println(max_first);
            }
        } 
    }
}