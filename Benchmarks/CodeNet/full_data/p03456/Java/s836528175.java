import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();

		sb.append(sc.nextInt()).append(sc.nextInt());

		int inNum = Integer.valueOf(sb.toString());

		for(int i = 4; i < 400 ; i++) {
			if (inNum == i*i) {
				System.out.println("Yes");
				break;
			} else if(inNum < i*i){
				System.out.println("No");
				break;
			}
		}
	}

}
