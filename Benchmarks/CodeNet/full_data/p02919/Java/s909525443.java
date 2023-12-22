import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Integer> p = new ArrayList<>();
		List<Integer> listPos = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			p.add(Integer.parseInt(sc.next()));
		} 
		listPos.add(0);
		for (int i = 1; i < n+1; i++) {
			listPos.add(p.indexOf(i)+1);
		}
		List<Integer> tempPos = new ArrayList<>();
		tempPos.add(0);
		tempPos.add(0);
		tempPos.add(listPos.get(n));
		tempPos.add(n+1);
		tempPos.add(n+1);
		Long points = 0L;
		for (int i = n-1; i > 0; i--) {
			tempPos.add(listPos.get(i));
			Collections.sort(tempPos);
			//System.out.println(tempPos);
			int pos = tempPos.indexOf(listPos.get(i));
			int posl1 = tempPos.get(pos - 1);
			int posl2 = tempPos.get(pos - 2);
			int posh1 = tempPos.get(pos + 1);
			int posh2 = tempPos.get(pos + 2);
			long low = (listPos.get(i) - posl1) * (posh2 - posh1);
			long high = (posh1 - listPos.get(i)) * (posl1 - posl2);
			points += i * (low + high);
		}
		System.out.println(points);
		return;
	}
}