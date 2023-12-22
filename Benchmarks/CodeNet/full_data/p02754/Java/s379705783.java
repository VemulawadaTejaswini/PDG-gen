import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int k = N/(A+B)*A;
	int n =N%(A+B);
	int j=0;
	if(n<=A){
	    j=n;
	}else{
	    j=A;
	}
	System.out.println(k+j);
    }
}
