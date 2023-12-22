import java.util.Scanner;
public class Main {
	public static int n;
	public static int m;
	public static int str[][];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		str = new int[m][2];
		boolean flag = false;

		for(int i = 0; i < m; i++){
			str[i][0] = scan.nextInt();
			str[i][1] = scan.nextInt();
		}
		for(int i = 0; i < m; i++){
			if(str[i][0]==1){
				flag = sub(str[i][1]);
				if(flag){
					System.out.println("POSSIBLE");
					return;
				}
			}
		}
		System.out.println("IMPOSSIBLE");

	}
	public static boolean sub(int a){
		for(int i = 0; i < m; i++){
			if((str[i][0] == a) && (str[i][1] == n)){
				return true;
			}
		}

		return false;

	}

}
