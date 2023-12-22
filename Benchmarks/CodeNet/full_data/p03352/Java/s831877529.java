import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 int a  = in.nextInt();
		 int nam = 0;
		 
		 int m = 0;
		 for(int i = 1; i <= a ; i ++ ){
		     nam = i * i;
		     if(nam > a){
                break;
		     }else{
		         m = nam;
		     }
		 }
		 System.out.print(m);
	}
}