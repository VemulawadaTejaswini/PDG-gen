import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int nam = sc.nextInt();
		
		String ans = "No";
		for(int i = 1; i <= 9; i++){
		    for(int j = 1; j <= 9;j++){
		        if(i * j == nam){
		            ans = "Yes";
		            break;
		        }
		    }
		}
		
		System.out.println(ans);
	}
}
