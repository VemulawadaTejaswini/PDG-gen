import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ai[] = new int[3];
		ai[0] = sc.nextInt();
		ai[1] = sc.nextInt();
		ai[2] = sc.nextInt();

		int c5 = 0;
		int c7 = 0;
		for (int i=0; i < 3; i++){
			switch(ai[i]){
			case 5:
				c5++;
				break;
			case 7:
				c7++;
				break;

			}
		}
		if (c5==2 && c7==1){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
