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
					int temp=index2;
					boolean flag2 = true;
					while (flag2) {
						if (indexIndex.get(temp)==temp) {
							flag2=false;
						} else {
							temp=indexIndex.get(temp);
						}
					}
					indexIndex.put(indexIndex.get(temp),index);

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
							if (list[number].equals(list[number+1])&&list[number].equals(list[number+2])) {
								int temp = 0 ;
								temp = kosuu [number+1];
								kosuu[number+1]=kosuu[number];
								kosuu[number +2]=temp;
								kosuu[number]=0;
								number+=2;
							} else {
							kosuu[number+1]+=kosuu[number];
							kosuu[number]=0;
							}
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
								if (list[number].equals(list[number+1])) {

									boolean flag3 = true;
									int temp = 0;
									while (flag3) {
										temp = kosuu[number+1];
										kosuu[number+1]=kosuu[number];
										int temp2 = kosuu[number+2];
										kosuu[number+2]=kosuu[number+1];
										if (list[number+1].equals(list[number+2])) {
											temp=temp2;
											number++;
										} else {
											flag3=false;
										}
									}
								} else {
								kosuu[number+1]+=kosuu[number];
								kosuu[number]=0;
								}
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