import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {


	public static void main(String[] args) {

		long ans = 0;
//		double ans = 0.0;
//		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

//		int n = sc.nextInt();
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
//		long[] a = new long[n];
//		long[] b = new long[n];
//		int[][] a = new int[n][m];

		Map<Long, Long> map = new TreeMap<>();

//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
		long c =0;
		while(n != c){
			map.put(sc.nextLong(), sc.nextLong());
			c++;
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

//		List<Long> list = new ArrayList<>(map.keySet());
//		List<Long> list2 = new ArrayList<>(map.values());


		 long x = 0;
		 long l = 0;
		 c = 0;
//		int count = 0;
		for(long key : map.keySet()){
			if(!f) {
				f = true;
				x = key;
				l = map.get(key);
				continue;
			}
//			System.err.println(x+" "+l+" "+key+" "+map.get(key));
			if(x + l > key - map.get(key)) {

				ans++;
			} else {
				x = key;
				l = map.get(key);
			}
			c++;

		}


		System.out.println(n-ans);

		sc.close();
	}


}