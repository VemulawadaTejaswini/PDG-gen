import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = 0;
  	int M = 0;
	N = sc.nextInt();
	M = sc.nextInt();
  	if((N < 1 )||(100 < N)){
      	System.exit(0);
    }
  	if(N > M){
      	System.exit(0);
    }
  
  	if(M < N){
		System.out.println("No");
    }else{
	 	System.out.println("Yes");
    }
	}
}