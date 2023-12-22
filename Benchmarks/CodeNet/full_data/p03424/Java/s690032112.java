import java.util.*;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStreamReader reader = new InputStreamReader(System.in);
		int n = sc.nextInt();
		int s;
		boolean y = false;
		for(int i = 1; i <= n; i++) {
			try {
                s = reader.read();
                if((char)s == 'Y') y = true;
			}
			catch(Exception e){
	            e.printStackTrace();
	        }
			}
        if(y == false) System.out.println("Three");
        else System.out.println("Four");
		}	
}
