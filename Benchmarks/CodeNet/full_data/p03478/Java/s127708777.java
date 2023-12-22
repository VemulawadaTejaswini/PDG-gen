import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int sum = 0;
		int num = 0;
		for(int i=1; i<=n; i++){
			num = method(i);
			if(a <= num && num <= b){
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static int method(int n){
		int sum = 0;
		while(n > 0){
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
