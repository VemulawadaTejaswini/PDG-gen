import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int numN = s.nextInt();
			int[] nums = new int[numN];

			for(int i = 0; i < numN; i++) {
				nums[i] = s.nextInt();
			}
			s.close();
			int count = 0;
			for(int i = 0; i < numN ; i++) {
				if(nums[i] != i +1 ) {
					count++;
				}
			}
			if(count == 2 ||count ==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}

	}

}
