import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i = 0; i<N ;i++){
    	A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    int x = 1;
    for(int i = 0; i<N-1; i++){
    	if(A[i] != A[i+1]){
    		x++;
    	}
    }
    if(x%2 == 1){
    	System.out.println(x);
    }else{
    	System.out.println(x-1);
    }
  }
}