import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N= keyboard.nextInt();
		int ans = 0; 
		
		for(int i = 1; i<N+1; i++){
		if(i%15 !=0 || i%3 !=0 || i%5 !=0){
		ans += i;
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
