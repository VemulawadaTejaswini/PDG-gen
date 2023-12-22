import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean isNumJudge = false;
			for(int a = 2;x*a < 1000000000;a++){
				if(x*a%y != 0){
					isNumJudge = true;
					System.out.println(x*a);
					break;
				}
			}
		if(isNumJudge == false){
			System.out.println(-1);
		}
	}

}
