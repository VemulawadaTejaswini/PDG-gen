import java.util.*;

public class Main{
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int s = scan.nextInt();
		
		int[] miss = new int[n];
		boolean[] ac = new boolean[n];
		
		for(int i = 0; i < s; i++){
			int q = scan.nextInt() - 1;
			String r = scan.next();
			if(r.equals("AC") && ac[q] == false){
				ac[q] = true;
			} else if(r.equals("WA") && ac[q] == false){
				miss[q] += 1;
			}
		}
		
		int count = 0;
		for(boolean result : ac){
			if(result){
				count++;
			}
		}
		System.out.print(count + " ");
		count = 0;
		for(int wa : miss){
			count += wa;
		}
		System.out.println(count);
		
		
	}
}