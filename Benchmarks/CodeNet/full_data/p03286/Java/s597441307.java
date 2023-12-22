import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		if(input<0){
			if(Math.abs(input)%2 == 1){
				input = Math.abs(input)+2;
			}
			else{
				input = Math.abs(input)+1;
			}
			
		}
		System.out.println(Long.toBinaryString(input));

	}
}