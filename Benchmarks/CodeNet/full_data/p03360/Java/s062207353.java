import java.util.*;

class Main {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

    	int ans = 0;		
    	
    	if(A>B&&A>C){
    	ans =	A * X;
    	}else if(B>A&&B>C){
    	ans = B * X;
    	}else if(C>A&&C>B){
    	ans = C * X;	
    	}
    	System.out.println(ans);
    }
}