import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Station s[] = new Station[N-1];
		Main main = new Main();
		for (int i=0;i<N-1;i++) {
			Station temp = main.new Station();
			temp.C= sc.nextLong();
			temp.S= sc.nextLong();
			temp.F = sc.nextLong();
			s[i] = temp;
		}
		long result[] = new long[N];
		for (int i=0;i<N-1;i++) {
			long now = 0;
			for (int j=i;j<N-1;j++) {
				if (now<=s[j].S) {
					now = s[j].S+s[j].C;
				} else {
					if (now%s[j].F==0) {
						now +=s[j].C;
					} else {
						long next= (now-s[j].S)/s[j].F+1;
						next = s[j].S+s[j].F*next;
						now +=next +s[j].C;
					}
				}
			}
			System.out.println(now);
		}
		System.out.println(0);
	}

	public class Station {
		long C;
		long S;
		long F;
	}
}