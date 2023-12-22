import java.util.*;

public class Main {

	public static void main(String[] args) {
		// make new Scanner.
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		// Listに格納.
		List<Integer> list = inList(sc,n);
		
		int sum=0;
		int b=0;
		
		for(int a=0; a < list.size(); a++) {
			int count =1;
			for(b=a+1; b<list.size(); b++) {
				if (list.get(a)!=list.get(b)) {
					break;
				} else {
					count++;
				}
			}
			sum = sum + count/2;
			a = b -1;
			
		}
		
		System.out.println(sum);

		// close Scanner
		sc.close();

	}

	
	/**
	 *  入力した数字を配列に格納するメソッド.
	 * @param sc
	 * @param n
	 * @return
	 */
	public static List<Integer> inList(Scanner sc, int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int a=0;a<n;a++) {
			list.add(sc.nextInt());
		}
		return list;
	}
	
	
	/**
	 *   リストの数字の美しさを求める.
	 */
	public static int beautyList(List<Integer> list, int d) {
		int a=0;
		for (int b=0;b<= list.size(); b++) {
			if (Math.abs(list.get(b) - list.get(b+1)) ==d) {
				a++;
			}
		}
		return a;
	}

}

