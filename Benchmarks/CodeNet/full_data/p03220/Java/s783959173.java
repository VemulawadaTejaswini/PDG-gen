import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		
		//int elev[] = new int[N];
		
		int diff = 12000;
		int num = 0;
		
		for(int i = 1; N >= i;i++){
			int highNum = sc.nextInt();
			
			
			highNum = T - ((highNum*6)/1000);
			
			
			if(diff > Math.abs(highNum - A)){
				diff = Math.abs(highNum - A);
				num = i;
			}
			
			
		}
		
		System.out.println(num);
	}
}
