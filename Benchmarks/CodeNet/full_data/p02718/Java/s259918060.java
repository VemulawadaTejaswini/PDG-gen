import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =  sc.nextInt();
    int M =  sc.nextInt();
    int[] A = new int[N];
    int all = 0;
    for(int i = 0; i < N; i++){
    	A[i] = sc.nextInt();
      	all += A[i];
    }
    
    int count = 0;
    for(int i = 0; i < N; i++){
    	if(A[i] >= all / (4 *M)){
        	count++;
        }
    }
    
    if(M <= count){
    	System.out.println("Yes");
    }else{
    	System.out.println("No");
    }
  }
}