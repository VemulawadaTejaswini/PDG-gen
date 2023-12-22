import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 1;;i++){
			 n = n - i;
			 System.out.println(i);
			 if (n <= i + 2){
				 if (n != 0) {
					 System.out.println(n);
				 }
				 break;
			 }
		}

		sc.close();
	}


}
