import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int robo = sc.nextInt();
		int[] plus = new int[robo];
		int[] minus = new int[robo];
		int x = 0;
		int l = 0;
		int count = 0;
		for (int i = 0; i < robo - 1; i++){
			x = sc.nextInt();
			l = sc.nextInt();
			plus[i] = x + l;
			minus[i] = x - l;
			if (plus[i] > minus[p - 1]){
				count++;
			}
		}
		System.out.plint(count);
	}
}