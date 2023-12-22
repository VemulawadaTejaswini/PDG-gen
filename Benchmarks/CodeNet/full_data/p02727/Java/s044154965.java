import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] aary = new int[a];
		int[] bary = new int[b];
		Integer[] cary = new Integer[c];
		for(int i=0; i<a; i++){
			aary[i] = sc.nextInt();
		}
		for(int i=0; i<b; i++){
			bary[i] = sc.nextInt();
		}
		for(int i=0; i<c; i++){
			cary[i] = sc.nextInt();
		}
		Arrays.sort(aary);
		Arrays.sort(bary);
		Arrays.sort(cary);
		Arrays.sort(cary, Comparator.reverseOrder());
		Integer[] aresult = new Integer[x];
		Integer[] bresult = new Integer[y];
		for(int i=0; i<x; i++){
			aresult[i] = aary[a-i-1];
		}
		for(int i=0; i<y; i++){
			bresult[i] = bary[b-i-1];
		}
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(aresult));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(bresult));
		list.addAll(list2);
		Collections.sort(list);
		int ccount = 0;
		for(int i=0; i<list.size(); i++){
			if(ccount != cary.length && list.get(i)<cary[ccount]){
				list.set(i, cary[ccount]);
				ccount++;
			} else {
				break;
			}
		}
		int result = 0;
		for(int i=0; i<list.size(); i++){
			result += list.get(i);
		}
		System.out.println(result);
	}
}
