import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		sc.close();

		String ans ="";
		for(int i = sy; i < ty; i++){
			ans += "U";
		}
		for(int i = sx; i < tx; i++){
			ans += "R";
		}
		for(int i = sy; i < ty; i++){
			ans += "D";
		}
		for(int i = sx; i <= tx; i++){
			ans += "L";
		}
		for(int i = sy; i <= ty; i++){
			ans += "U";
		}
		for(int i = sx; i <= tx; i++){
			ans += "R";
		}
		ans += "DR";
		for(int i = sy; i <= ty; i++){
			ans += "D";
		}
		for(int i = sx; i <= tx; i++){
			ans += "L";
		}
		ans += "U";

		System.out.println(ans);
	}
}