import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int max = A+B;
	int m = A-B;
	int k = A*B;
	if(max<m){
	    max=m;
	}
	if(max<k){
	    max=k;
	}
	System.out.println(max);
    }
}
	    
