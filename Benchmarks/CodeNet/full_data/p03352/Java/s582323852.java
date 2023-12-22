import java.util.*;
public class Main{
	public static void main(String[] args){
		//1<=x<=1000
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int max = 0;
		for(int i = 0;i < x;x++){
			for(int q = 0;q < x;q++){
				if(Math.pow(i, q) <= x){
					max = (Math.max((int)Math.pow(i, q), max));
				}
			}
		}
		System.out.println(max);
		
		
		
	
	}
}
