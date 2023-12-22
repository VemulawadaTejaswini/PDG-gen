import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int start[] = new int[N];
		int len[] = new int[N];
		int often[] = new int[N];
		
		for(int i = 1; i<N; i++) {
			len[i] = sc.nextInt();
			start[i] = sc.nextInt();
			often[i] = sc.nextInt();
		}
		
		for(int i = 1; i<N; i++) {
			int time = 0;
			for(int j = i; j<N; j++) {
//				System.out.println(time + " " + start[j]);
				if(time <= start[j]) {
					time = start[j] + len[j];
				}
				else {
					int next = (int) Math.ceil(time/(1.0*often[j]))*often[j];
					time = next + len[j];
				}
			}
			
			System.out.println(time);
		}
		System.out.println(0);
	}

}
