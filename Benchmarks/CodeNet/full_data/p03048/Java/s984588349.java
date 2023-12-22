import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int R = Integer.parseInt(spl[0]);
		int G = Integer.parseInt(spl[1]);
		int B = Integer.parseInt(spl[2]);
		int N = Integer.parseInt(spl[3]);
		sc.close();
		
		int cnt = 0;
		for(int r = 0;r <= N;r++){
			for(int g = 0;g <= N;g++){
				int num = N - r * R - g * G;
				if(num / B >= 0 && num % B == 0){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}