import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Integer> diviser_list = divise(M);
		Collections.reverse(diviser_list);
		for (int i=0;i<diviser_list.size();i++) {
			if (M/diviser_list.get(i)>=N) {
				System.out.println(diviser_list.get(i));
				break;
			}
		}
	}

    static ArrayList<Integer> divise(int n) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                list.add(i);
                if (i*i!=n) {
					list.add(n/i);
                }
            }
        }
        Collections.sort(list);
                return list;
    }
}