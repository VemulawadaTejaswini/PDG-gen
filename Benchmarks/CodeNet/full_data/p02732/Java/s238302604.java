import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
//		int a[] = new int[200000];
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			a.add(sc.nextInt());
//			a[i] = sc.nextInt();
		}
		printAL(a);

		int count = 0;
		for(int k=0; k<n; k++) {
			ArrayList<Integer> ak = (ArrayList<Integer>)a.clone();
			ak.remove(k);
			printAL(ak);
			count = calcSelectionCount(ak);
			System.out.printf("%d\n", count);
//			System.out.printf("\n");
		}


//			ArrayList<Integer> ak = (ArrayList<Integer>)a.clone();
//			ak.remove(i);
//			println(ak);
//		System.out.printf("%d", count);
		//System.out.println(res);
	}

	static void printIA(int[] a, int size) {
		for(int i=0; i<size; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("\n");
	}
	static void printAL(ArrayList<Integer> a) {
//		a.forEach(o -> {System.out.printf("%d ", (int)o);});
//		System.out.printf("\n");
	}

	static int calcSelectionCount(ArrayList<Integer> a) {
		int count = 0;
		while(a.size() > 0) {
			int target = a.get(0);
			a.remove(0);
//			System.out.printf("start:%d, ",target);
			printAL(a);
			count += countSameNum(a, target);
//			System.out.printf(", %d:end\n",target);
		}
		return count;
	}

	static int Count = 0;
	static int countSameNum(ArrayList<Integer> a,int target) {
		Count = 0;
		a.forEach(o -> {if((int)o == target) {Count++;}});
		return Count;
	}
}


