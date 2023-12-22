import java.util.Scanner;
public class AnotherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
			int Chris = 25;
			int lol = sc.nextInt();
			if(lol ==25) {
				System.out.println("Christmas");
				System.exit(0);
			}
			System.out.print("Christmas ");
			for(int i =0; i<Chris-lol; i++) {
				System.out.print("Eve ");
			}
	}

}
