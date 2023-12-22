import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();

		int[] golem = new int[N];
		for(int i = 0;i<N;i++) {
			golem[i] = 1;
		}

		for(int i = 0;i<Q;i++) {
			String t = sc.next();
			String d = sc.next();
			int[] box = new int[N];
			for(int j = 0;j<N;j++) {
				if(s.charAt(j) == t.charAt(0) && golem[j] > 0) {
					if(d.charAt(0) == 'L') {
						if(j != 0) {
							box[j-1]+=golem[j];
						}
						box[j]-=golem[j];
					} else {
						if(j != N-1) {
							box[j+1]+=golem[j];
						}
						box[j]-=golem[j];
					}
				}
			}
			for(int j = 0;j<N;j++) {
				golem[j] += box[j];
			};
		}



		int count = 0;
		for(int i = 0;i<N;i++) {
			count+=golem[i];
		}

		System.out.println(count);
	}

}
