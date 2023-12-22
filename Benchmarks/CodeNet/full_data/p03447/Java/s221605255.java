import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int X = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = 0;
			if((1 <= A && B <= 1000) && (A + B <= X && X <= 10000)){
				sum = X - (A + B);
				for(; sum - B> 0;) {
				sum = sum - B;}}
				System.out.println(sum);
			}}