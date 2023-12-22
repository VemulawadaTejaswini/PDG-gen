import java.util.*;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStreamReader reader = new InputStreamReader(System.in);
		int n = sc.nextInt();
		int s;
		for(int i = 0; i < n; i++) {
			try {
                s = reader.read();
                if((char)s == 'Y') {
               		System.out.println("Four");
               		return;
                   }
			}catch(Exception e){
	            e.printStackTrace();
	        }              
			}
		System.out.println("Three");
	}
}
