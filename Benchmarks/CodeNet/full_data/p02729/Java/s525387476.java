import java.util.*;

public class Main{
	/*public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
	    
		int a=(N*(N-1)/2);
		
		if(M < 2)
			System.out.println(a);
		else {
			System.out.println(a+M);
		}
	}*/
	 public static void main(String[] args) {
	        Scanner stdIn=new Scanner(System.in);
	 
	        int M=stdIn.nextInt();
	        int N=stdIn.nextInt();
	 
	        System.out.println(M*(M-1)/2+N*(N-1)/2);
	 }
}