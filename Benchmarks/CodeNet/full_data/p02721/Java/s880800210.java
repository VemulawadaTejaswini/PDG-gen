import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn  =new Scanner(System.in);
		int N = scn.nextInt(),K = scn.nextInt(),C = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();

		int n = N;
		int s = 0;

		int num = 0;
		for(int j = 0;j < N;j++) {
			if(str[j] =='o') {
				num++;
				j+=C;
				if(num == K) {
					n = Math.min(N, j+1);
					break;
				}
			}
		}

		num = 0;
		for(int j = N-1;j > -1;j--) {
			if(str[j] =='o') {
				num++;
				j-=C;
				if(num == K) {
					s = Math.max(0, j-1);
					break;
				}
			}
		}

		for(int i = s;i <n;i++) {
			char[] str2 = str.clone();
			str2[i] = 'x';
			num = 0;
			for(int j = 0;j < N;j++) {

				if(str2[j] =='o') {
					num++;
					j+=C;
					if(num == K) {
						n = Math.min(N, j+1);
						break;
					}
					continue;
				}
				if(j > N-(C*(K-num-1)))break;
			}
			if(num<K)System.out.println(i+1);
		}
	}

}
