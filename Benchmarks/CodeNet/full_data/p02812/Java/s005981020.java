import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		String s = sc.next();

		int index=0;
		int count=0;

		while(true) {
			if(s.indexOf("ABC",index)!= -1) {
				index = s.indexOf("ABC",index)+3;
			}else {
				break;
			}
			count++;
		}

		System.out.println(count++);


	}
}

