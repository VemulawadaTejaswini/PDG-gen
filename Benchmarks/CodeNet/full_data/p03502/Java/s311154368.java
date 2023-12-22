
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int s = Integer.parseInt(str);

		int[] n = new int[str.length()];
		int sum = 0;
		for(int i=0; i<n.length; i++){
			n[i] = str.charAt(i)  - '0';
			sum += n[i];
		}

		if(s%sum == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
