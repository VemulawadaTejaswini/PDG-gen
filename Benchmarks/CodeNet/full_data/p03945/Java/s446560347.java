import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []c = sc.next().toCharArray();
		
		int n = c.length;
		
		int count = 0;
		
		for(int i = 0; i < n-1 ; i++) {
			if(c[i] != c[i+1]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
