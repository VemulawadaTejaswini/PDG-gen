import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		if(a.equals("hi")){
			System.out.println("Yes");
		}else if(a.equals("hihi")) {
			System.out.println("Yes");
		}else if(a.equals("hihihi")){
			System.out.println("Yes");
		}else if(a.equals("hihihihi")) {
			System.out.println("Yes");
		}else if(a.contentEquals("hihihihihi")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
