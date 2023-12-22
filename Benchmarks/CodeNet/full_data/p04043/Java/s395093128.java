import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		for(int i = 0;i < 3;++i)
			x[i] = sc.nextInt();
		sc.close();
		
		int count5 = 0;
		int count7 = 0;
		for(int i = 0;i < 3;++i)
			if(x[i] == 5)
				++count5;
			else if(x[i] == 7)
				++count7;
		if(count5 == 2 && count7 == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
