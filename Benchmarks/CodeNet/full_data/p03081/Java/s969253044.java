import java.util.Scanner;
public class Main{

	public static void main (String [] args) {

		Main main = new Main ();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		String s = scanner.next();

		String[] list = new String[N];
		int [] kosuu = new int [N];

		for (int index=0; index<N; index++) {
			kosuu[index]=1;
		}
		list=s.split("");

		for (int index=0; index<Q; index++) {

			String t = scanner.next();
			String d = scanner.next();

			for (int index2=0; index2<N; index2++) {

				if (list[index2].equals(t)) {

					try {
						if (d.equals("L")) {
							kosuu[index2-1]+=kosuu[index2];
							kosuu[index2]=0;
						} else {
							kosuu[index2+1]+=kosuu[index2];
							kosuu[index2]=0;
						}
					} catch (Exception e) {
						kosuu[index2]=0;
					}
				}
			}
		}
		int count=0;
		for (int index=0; index<N; index++) {

			count+=kosuu[index];
		}
		System.out.println(count);
	}
}