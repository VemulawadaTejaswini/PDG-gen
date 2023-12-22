import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int sum = 700;
			String a = "o";
			String b = "x";
			for(int i = 0; i < 3; i++) {
			String S = sc.next();
			if(S.equals(a)) {
			sum = sum + 100;}
			else if(S.equals(b)){
			sum = sum + 0;}}
			System.out.println(sum);
			}
			}