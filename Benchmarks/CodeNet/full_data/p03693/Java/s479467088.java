import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String r = scan.next();
		String g = scan.next();
		String b = scan.next();
		String color = r + g + b;
		int colornum = Integer.parseInt(color);

		if(colornum%4 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}


	}

}
