import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 int a = in.nextInt();
		 int b = in.nextInt();
		 
		 if(a < b){
		    for(int i = 0 ;i < b ;i++){
		     System.out.print(a);
		 }
		 }else{
		     for(int i = 0 ;i < a ;i++){
		     System.out.print(b);
		 }
		 }

      
	}
}