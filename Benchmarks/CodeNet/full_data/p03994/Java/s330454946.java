import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			StringBuilder s = new StringBuilder(scan.nextLine());
			int K = scan.nextInt();
			
			int index = 0;
			
			while(K > 0 && index < s.length()){
				int diff = ('z' - s.charAt(index) + 1) % 26;
				if(K - diff >= 0){
					K -= diff;
					s.replace(index, index+1, "a");
				}
				index++;
			}
			
			char c = s.charAt(s.length()-1);
			for(;K>0; K--){
				c++;
				if(c > 'z'){
					c = 'a';
				}
			}

			s.replace(s.length()-1, s.length(), String.valueOf(c));
			
			System.out.println(s.toString());
		}
	}
}
