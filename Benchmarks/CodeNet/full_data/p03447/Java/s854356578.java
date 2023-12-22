import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int X = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			if((1 <= A && B <= 1000) && (A + B < X && X <= 10000)) {
				X = X - (A + B);
				for(; X - B> 0;) {
				X = X - B;}
				System.out.println(X);}
			else{System.out.println("0");}
			}}