
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		boolean b = true;
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i<3; i ++){
		int x=data%10;
		a.add(x);
		data=data/10;
		if(a.get(i)==7) {
			b=true;
			break;
		}
		b=false;
		}
		if(b==true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}