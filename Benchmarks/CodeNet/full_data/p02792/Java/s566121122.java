import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long result = 0;
		for (int i = 1; i <= N; i++) {
			result = result + compute(i, N);
		}
		System.out.println(result);
	}

	private static long compute(int i, int N) {
		Integer[] tensi = base10(i);
		int len = tensi.length;
		if (tensi[0] == 0) {
			return 0;
		}

		int first = tensi[len - 1];
		int last = tensi[0];

		Integer[] tensN = base10(N);
		int lenN = tensN.length;

		if (first == last) {
			long res = 0;
			for (int jlen = 1; jlen <= lenN; jlen++) {
				if (jlen == 1) {
					res = res + 1;
				} else if (jlen == 2) {
					int x = last * 10 + first;
					if (x <= N) {
						res = res + 1;
					}
				} else if (jlen < lenN) {
					res = res + (long) Math.pow(10, (jlen - 2));
				} else {
					int tmp = (int) Math.pow(10, lenN - 1) * last + first;

					if (tmp <= N) {
						if( tensN[lenN-1] > last ) {
							res = res + (int)Math.pow(10, jlen-2);
						}
						else if( tensN[lenN-1] == last) {
							int z =  0;
							for (int p=1,base=1;p<=lenN-2;p++) {
								z = z +  tensN[p]*base;
								base = base * 10;
							}
							res = res + z + 1 - ((tensN[0] < first)?1:0);
						}else {
							res = res + 0;
						}
						
					}
				}
			}
			return res;
		}

		int res = 0;

		for (int jlen = 1; jlen <= lenN; jlen++) {

			if (jlen == 1) {
				res = res + 0;
			} else if (jlen == 2) {
				int x = last * 10 + first;
				if (x <= N) {
					res = res + 1;
				}
			} else if (jlen < lenN) {
				res = res + (int) Math.pow(10, (jlen - 2));
			} else {
				int tmp = (int) Math.pow(10, lenN - 1) * last + first;

				if (tmp <= N) {
					if( tensN[lenN-1] > last ) {
						res = res + (int)Math.pow(10, lenN-2);
					}
					else if( tensN[lenN-1] == last) {
						int z =  0;
						for (int p=1,base=1;p<=lenN-2;p++) {
							z = z +  tensN[p]*base;
							base = base * 10;
						}
						res = res + z + 1 - ((tensN[0] < first)?1:0);
					}else {
						res = res + 0;
					}
				}
			}

		}

		return res;

	}

	private static Integer[] base10(int N) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int n = N;
		while (n != 0) {
			int d = n % 10;
			n = n / 10;
			list.addLast(d);
		}
		Integer[] tens = new Integer[list.size()];
		for (int i = 0, size = list.size(); i < size; i++) {
			tens[i] = list.get(i);
		}

		return tens;
	}

}
