import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int k = N/(A+B)*A;
	int n =N%(A+B);
	int j=Math.min(n,A);
	System.out.println(k+j);
    }
}
	
