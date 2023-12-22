import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int Hlist[] = new int[N];
		for(int i = 0; i < N; i++) {
			Hlist[i] = sc.nextInt();
		}
		for(int i = 0; i < Hlist.length; i++) {
			int j = 1;
			int time = 0;
			while(true) {
				if(i + j >= Hlist.length) {
					break;
				}
				if(Hlist[i + j - 1] >= Hlist[i + j]) {
					time++;
				}else {
					break;
				}
				j++;
			}
			if(time > max) {
				max = time;
			}
		}
		System.out.println(max);
	}

}