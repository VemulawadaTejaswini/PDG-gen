import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		for (int i=0; i < n; i++){
			sc.nextInt();
		}
		int replaceCount = k;
		int controllCount = 1;
		while (replaceCount < n){
			replaceCount += (k - 1);
			controllCount++;
		}
		System.out.println(controllCount);
	}
}