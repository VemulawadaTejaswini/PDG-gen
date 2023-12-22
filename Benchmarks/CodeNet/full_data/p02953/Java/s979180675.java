import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int vector[] = new int [n];
		for(int i=0; i<n ; i++) {
			vector[i]=reader.nextInt();
		}
		for(int i=0; i<n-1;i++) {
			if(vector[i]>=vector[i+1]) {
				vector[i]=vector[i]-1;
			}
		}
		boolean ban = true;
		for(int i=0; i<n-1; i++) {
			if(vector[i]>vector[i+1]) {
				ban = false;
				break;
			}
		}
		if(ban) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
