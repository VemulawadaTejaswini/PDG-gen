import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {


	public static void main(String[] args) {

//		long ans = 0;
//		double ans = 0.0;
		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


//		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];

//		int[] a = new int[n];
//		int[] b = new int[n];
		long[] a = new long[n];
		long[] b = new long[n];
//		int[][] a = new int[n][m];

		Map<Long, Long> map = new TreeMap<>();


//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			map.put(a[i], b[i]);
		}


//		for(int i = 0; i < a.length-1; i++){
//            for(int j = i+1; j < a.length; j++){
//                if(a[j] < a[i]){
//                    long temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                    long temp2 = b[i];
//                    b[i] = b[j];
//                    b[j] = temp2;
//                }
//            }
//        }

//		Object[] mapkey = map.keySet().toArray();
//        Arrays.sort(mapkey);

		List<Long> list = new ArrayList<>(map.keySet());
		List<Long> list2 = new ArrayList<>(map.values());

		int index = 0;
		int count = 0;
		for(int i = 0; i < n-1; i++) {
			if(list.get(index) + list2.get(index) > list.get(i+1) - list2.get(i+1)) {
				ans++;
			} else {
				index = i;
			}
		}






		System.out.println(n-ans);

		sc.close();
	}


}
