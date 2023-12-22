import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 3;i <=n;i+=2) {
			if(isYakusuEight(i)) {
				answer++;
			}
		}
		System.out.println(answer);
 
	}
 
	private static boolean isYakusuEight(int number) {
		int yakusu = 0;
		for(int i =1; i <=number;i++) {
			if(number % i ==0) {
				yakusu++;
			}
		}
 
		if(yakusu ==8) {
			return true;
		}
		return false;
	}
}