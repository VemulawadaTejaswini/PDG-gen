import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		
		if(A==B && B==C){
			System.out.println("no");
        }else if(A==B && B!=C){
			System.out.println("yes");
        }else if(A!=B && B==C){
			System.out.println("yes");
        }else if(A!=B && B!=C){
			System.out.println("yes");
    	}
 
	}
    
}