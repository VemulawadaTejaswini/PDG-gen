import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int x5=0;
		int x7=0;
		
		for(int i=0; i<3; i++){
			int x = sc.nextInt();
			if(x == 5)
				x5++;
			else if(x == 7)
				x7++;
			else
				System.out.println("NO");
		}
		if(x5 == 2 && x7 == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		sc.close();
	}
}
