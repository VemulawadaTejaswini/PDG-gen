import java.util.HashMap;
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
		String [] match2 = new String [N];
		HashMap <Integer,Integer> indexIndex = new HashMap <Integer,Integer>();
		HashMap <String,Integer> letterIndex= new HashMap <String,Integer>();

		for (int index=0; index<N; index++) {
			indexIndex.put(index,index);
		}
		for (int index=0; index<N; index++) {

			boolean flag = true;
			for (int index2=0; index2<N; index2++) {
				if (list[index].equals(match2[index2])) {
					indexIndex.put(index2,index);
					flag = false;
					break;
				}
			}
			if (flag==true) {
				match2[index]=list[index];
				letterIndex.put(match2[index], index);
			}
		}
		for (int index=0; index<Q; index++) {

			String t = scanner.next();
			String d = scanner.next();

			int number=0;

			boolean flag = true;
			try {
				 number = letterIndex.get(t);
			} catch (Exception e) {
				flag=false;
			}
			if (flag==true) {
				if (indexIndex.get(number)==number){

					try {
						if (d.equals("L")) {
							kosuu[number-1]+=kosuu[number];
							kosuu[number]=0;
						} else {
							kosuu[number+1]+=kosuu[number];
							kosuu[number]=0;
						}
						} catch (Exception e) {
						kosuu[number]=0;
					}
				} else {
					boolean flag2 = true;

					while (flag2) {
						try {
							if (d.equals("L")) {
								kosuu[number-1]+=kosuu[number];
								kosuu[number]=0;
							} else {
								kosuu[number+1]+=kosuu[number];
								kosuu[number]=0;
							}
						} catch (Exception e) {
							kosuu[number]=0;
						}
							if (number==indexIndex.get(number)) {
								flag2=false;
							} else {
								number = indexIndex.get(number);
							}
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