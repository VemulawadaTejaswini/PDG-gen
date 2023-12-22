
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		    Scanner scanner = new Scanner(System.in);
		    
		    int H = scanner.nextInt();
		    int A = scanner.nextInt();
		    int i = 0;
		    
		    while(true){
		    	if(H-A*i<=0) {
		    		break;
		    	}
		      i++;
		    }
		    System.out.println(i);
		  }
}
