
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		long[] pa = new long[(int)a];
		long[] pb = new long[(int)b];
		long[] pc = new long[(int)c];
		for(int i = 0; i < a; i++){
			pa[i] = scanner.nextInt();
		}
		for(int i = 0; i < b; i++){
			pb[i] = scanner.nextInt();
		}
		for(int i = 0; i < c; i++){
			pc[i] = scanner.nextInt();
		}
		Arrays.sort(pa);
		Arrays.sort(pb);
		Arrays.sort(pc);
//		long[] xSet = new long[x];
//		long[] ySet = new long[y];
		long[] allSet = new long[x+y];
		int cnt = 0;

		for(int i = 0; i < x; i++){
//			xSet[i] = pa[a-1-i];
			allSet[cnt] = pa[a-1-i];
			cnt++;
		}
		for(int i = 0; i < y; i++){
//			ySet[i] = pb[b-1-i];
			allSet[cnt] = pb[b-1-i];
			cnt++;
		}
		Arrays.sort(allSet);
		int limit = Math.min(pc.length, allSet.length);
		for(int i = 0; i < limit; i++){
			if(allSet[i] < pc[c-1-i]){
				allSet[i] = pc[c-1-i];
			}else{
				break;
			}
		}


		System.out.println(Arrays.stream(allSet).sum());

		scanner.close();
	}

}
