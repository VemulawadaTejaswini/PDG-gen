import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int b = 0;
		int count = 0;
		if(x <= 6){
		System.out.println(count);
		}
		if(x > 6){
		b = 6;
		LOOP:while(true){
		if(b == 5){
			x = x-5;
			b = 6;
			count++;
			if(x <= 0){
				break LOOP;
			}
		}
		if(b == 6){
			x = x-6;
			b = 5;
			count++;
			if(x <= 0){
				break LOOP;
			}
		}
	}
		System.out.println(count);
		}
	}
}