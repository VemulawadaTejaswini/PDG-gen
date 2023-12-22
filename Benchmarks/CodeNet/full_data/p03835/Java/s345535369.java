import java.util.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int count = 0;
		
		for(int x = 0; x <= s; x++){
		for(int y = 0; y <= s-x; y++){
		for(int z = 0; z <= s-x-y; z++){
		
		if(x <= k && y <= k && z <= k && s == x + y + z) {
		count += 1; 
		}}}}
		
		System.out.println(count);
	}
}