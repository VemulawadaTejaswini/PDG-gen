import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			int a = in.nextInt();
			if(a<min) min=a;
			if(a>max) max=a;
		}
		System.out.println(max-min);
		in.close();
	}

}
