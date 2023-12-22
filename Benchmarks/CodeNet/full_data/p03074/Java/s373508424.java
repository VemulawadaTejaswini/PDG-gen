
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		String S = scan.next();
		
		scan.close();
		
		int saka = Integer.parseInt(String.valueOf(S.charAt(0)));
		int c = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int i=0; i<N; i++) {
			if(saka == Integer.parseInt(String.valueOf(S.charAt(i)))) {
				c++;
			} else {
				list.add(c);
				list2.add(saka);
				saka = Integer.parseInt(String.valueOf(S.charAt(i)));
				c=1;
			}
		}
		list.add(c);
		list2.add(saka);
		//System.out.println(list.toString());
		//System.out.println(list2.toString());
		
		int r = 0;
		for(int h=0; h<list.size(); h++) {
			int sakaCount = 0;
			int changeCount = 0;
			for(int i=h; i<list.size(); i++) {
				if(list2.get(i) == 0) {
					changeCount++;
					if(changeCount>K) {
						if(r<sakaCount) {
							r = sakaCount;
						}
						//System.out.println(sakaCount);
						sakaCount = 0;
						changeCount = 0;
						break;
					} else {
						sakaCount+=list.get(i);
						
					}
				} else {
					sakaCount+=list.get(i);

				}

			}
			if(r<sakaCount) {
				r = sakaCount;
			}
		}

		System.out.println(r);


	
	}

}
