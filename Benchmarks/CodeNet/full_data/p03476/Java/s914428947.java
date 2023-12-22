import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] isSosu = new boolean[100010];

		for(int i = 2; i < 100010; i++) {
			int warare = i;
			boolean isSo = true;
			for(int warusu = 2; warusu < warare; warusu++) {
				if(warare%warusu==0) {
					isSo = false;
					break;
				}
			}
			isSosu[i]=isSo;
		}
		int st, en;
		int[] ruisekiWA = new int[100000];
		for(int i = 3; i < 100000; i++) {
			ruisekiWA[i] = ruisekiWA[i-1];
			if(i%2==1&&isSosu[i]==true&&isSosu[(i+1)/2]==true) {
				ruisekiWA[i]++;
			}
		}
		for(int i = 0; i < n; i++) {
			st=sc.nextInt();
			en=sc.nextInt();
			System.out.println(ruisekiWA[en]-ruisekiWA[st-1]);
		}
	}
}