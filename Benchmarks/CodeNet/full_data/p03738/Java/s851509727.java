import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		Scanner s = new Scanner(System.in);
		int b = Integer.parseInt(s.next());
		if(a>b){
			System.out.println("GREATER");
		}else if(a<b){
			System.out.println("LESS");
		}else{
			System.out.println("EQUAL");
		}
		sc.close();
	}

}