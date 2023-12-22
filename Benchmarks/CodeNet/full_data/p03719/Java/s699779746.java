import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
      
      if(c>=a && a<=b){
      	System.out.println('Yes');
      }else{
      	System.out.println('No');
      }
          
	}
}