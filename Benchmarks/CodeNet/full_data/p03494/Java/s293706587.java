import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int a;

		for(int i = 0; i < N; i++){
			a = sc.nextInt();
			if(a % 2 == 0) count++;
		}

		System.out.println(count);
	}
}
