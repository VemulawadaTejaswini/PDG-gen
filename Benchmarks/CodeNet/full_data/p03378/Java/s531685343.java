import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int less = 0;

		for(int i=0; i<m; i++){
			int s = Integer.parseInt(sc.next());
			if (s < x){
				less += 1;
			}else{
				break;
			}
		}
		System.out.println(Math.min(less, m-less));
	}
}