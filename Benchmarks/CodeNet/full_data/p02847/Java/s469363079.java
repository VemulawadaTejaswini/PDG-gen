import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String we = sc.next();
		
		if(we=="SAT") {
			System.out.println(1);
		}
		if(we=="FRI") {
			System.out.println(2);
		}
		if(we=="THU") {
			System.out.println(3);
		}
		if(we=="WED") {
			System.out.println(4);
		}
		if(we=="TUE") {
			System.out.println(5);
		}
		if(we=="MON") {
			System.out.println(6);
		}
		else{
			System.out.println(7);
		}
	}

}
