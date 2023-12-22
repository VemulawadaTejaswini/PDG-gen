import java.util.Scanner;

/**
 * https://abc042.contest.atcoder.jp/tasks/arc058_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] d = new int[K];
		for(int i=0; i<K; i++) d[i] = sc.nextInt();
		sc.close();
		
		int ans = N;
		while(true){
			boolean check = true;
			String tmp = String.valueOf(ans);
			for(int i=0; i<K; i++){
				if(tmp.contains(String.valueOf(d[i]))){
					check = false;
					break;
				}
			}
			if(check){
				break;
			}
			ans++;
		}
		System.out.println(ans);

	}

}
