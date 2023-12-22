import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int answer =0;
		int s =  sc.nextInt();
		if(s == 1){
			answer = answer + 1;
		}
		int t =  sc.nextInt();
		if(t == 1){
			answer = answer + 1;
		}
		int u =  sc.nextInt();
		if(u == 1){
			answer = answer + 1;
		}


		System.out.println(answer);
	}
}
