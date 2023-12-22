import java.util.*;
public class Main {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int war[][] = new int[M][2];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if(a > b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			war[i][0]=a;
			war[i][1]=b;
		}
		sc.close();
		
		//bで昇順にソート
		Arrays.sort(war, (w1,w2) -> w1[1] - w2[1] );
		int head = 0; 
		int cnt = 0;
		for(int i=0;i<M;i++) {
			int a = war[i][0];
			int b = war[i][1];
			if(a >= head) {
				cnt ++;
				head = b;
			}
		}
		System.out.println(cnt);
	}
}