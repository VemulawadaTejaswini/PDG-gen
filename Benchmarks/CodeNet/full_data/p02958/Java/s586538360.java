import java.util.Scanner;

public class Main {
	  public static void main(String[] args ) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int[] array = new int[A];
		int count = 0;
		
		for (int i = 0;i < A; i++) {
			array[i] = sc.nextInt();
			if(array[i] != i+1) {
				count ++;
				if (count >= 3) {
					break;
				}
			}
		}
		if(count < 3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}