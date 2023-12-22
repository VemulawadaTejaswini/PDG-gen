import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn  =new Scanner(System.in);
		int N = scn.nextInt(),K = scn.nextInt(),C = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();

		int n = N;
		for(int i = 0;i <n;i++) {
			char[] str2 = str.clone();
			str2[i] = 'x';
			int num = 0;
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
