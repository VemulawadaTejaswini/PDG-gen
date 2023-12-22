import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		String g = sc.next();
		String b = sc.next();
			int num = Integer.parseInt(r + g + b);
			if (num%4==0){
				System.out.println("Yes");
			} else{
				System.out.println("No");
			}
		}

	}

