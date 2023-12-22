import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		String A = stdIn.next();
		
	if( A.charAt(0)==A.charAt(1) && A.charAt(1)==A.charAt(2) ){
			System.out.println("No");
        }else{
			System.out.println("Yes");
    	}
 
	}
    
}