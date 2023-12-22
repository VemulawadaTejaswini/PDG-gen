import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner reader  =new Scanner(System.in);	
	 int A=reader.nextInt();
	 int B=reader.nextInt();
	 int s1=A+B;
	 if(s1%3==0) {
		 System.out.println("Possible");
		 
	 }
	 else {
		 System.out.println("Impossible");
	
	 }
	}

}
