
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 
		 int n=sc.nextInt(),
		 	 a=sc.nextInt(),
			 b=sc.nextInt();
			 
		 if(a==0){
		 	System.out.print(0);
			System.exit(0);
		 }
		 else{
		 	System.out.print(a+n-a-b);
		 }
	}
}