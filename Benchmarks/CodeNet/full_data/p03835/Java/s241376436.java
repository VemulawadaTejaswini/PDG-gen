import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int  k = scanner.nextInt();
		int  s=scanner.nextInt();


		int result=0;

		for(int x=0;x<=k;x++) {

			for(int y=0;y<=k;y++) {

				boolean isMacth= k>=s-(x+y) && s-(x+y)>=0;

				if(isMacth) {
					result++;
				}

			}

		}

		System.out.println(result);


		scanner.close();

	}




}
