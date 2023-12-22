import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
	
	void run(){
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int count = 0;
		long sum = 0;
		for(;count < n;){
			if( x >= sum + a[count]){
				sum = sum + a[count];
				count++;
			}else{
				break;
			}
		}
		if(count == n && sum != x ){
			count --;
		}
		System.out.println(count);
	}
}