import java.util.*;
public class Main{
	// output:number of bi boll
	// input:3 math
	public static void main(String args[]) {
		
		// input:math info set to array from 
		int boll_num = 0;
		//int math[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		String stdin = scan.next();
		
		// evaluate the value ot each math
		for(int i=0;i<stdin.length();i++) {
			//System.out.println(String.valueOf(stdin.charAt(i)));
			if("1".equals(String.valueOf(stdin.charAt(i)))) boll_num++;
		}
		scan.close();
		
		// output:number of bi boll
		System.out.println(boll_num);
	}
}