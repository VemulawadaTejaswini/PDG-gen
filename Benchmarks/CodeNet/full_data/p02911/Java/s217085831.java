import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int array[] = new int [q];
		for(int i = 0;i < q;i++){
			array[i] = sc.nextInt() - 1;
		}

		for(int i = 0;i < n;i++){
			int count = 0;
			for(int j = 0;j<q;j++){
				if(i==array[j]){
					count++;
				}
			}
			if((k - q + count) <= 0){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}
	}
}
