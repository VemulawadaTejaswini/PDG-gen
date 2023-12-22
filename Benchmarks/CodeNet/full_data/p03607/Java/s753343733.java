import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		HashMap hm = new HashMap();
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			if (hm.containsKey(a)) {
				hm.delete(a);
				--ans;
			} else {
				hm.put(a, 0);
				++ans;
			}
		}
		System.out.println(ans);
	}

	static class HashMap {
		class Pair {
			long key;
			long value;

			public Pair(long key_, long value_) {
				key = key_;
				value = value_;
			}
		}

		Random rand = new Random();
		long p = (long) 1e6 + 7;
		long a = rand.nextInt((int) p - 1) + 1;
		long b = rand.nextInt((int) p - 1) + 1;
		int sz = 16;
		int cnt = 0;
		LinkedList<Pair>[] list;

		public HashMap() {
			list = new LinkedList[sz];
			for (int i = 0; i < list.length; ++i) {
				list[i] = new LinkedList<>();
			}
		}

		public HashMap(int sz_) {
			sz = sz_;
			list = new LinkedList[sz];
			for (int i = 0; i < list.length; ++i) {
				list[i] = new LinkedList<>();
			}
		}

		boolean delete(long key) {
			int id = hash(key);
			boolean ret = false;
			for (int i = 0; i < list[id].size(); ++i) {
				if (list[id].get(i).key == key) {
					list[id].remove(i);
					ret = true;
					break;
				}
			}
			if (sz >= 3 * cnt) {
				changeSize(sz / 2);
			}
			return ret;
		}

		void put(long key, long value) {
			int id = hash(key);
			for (int i = 0; i < list[id].size(); ++i) {
				if (list[id].get(i).key == key) {
					list[id].get(i).value = value;
					return;
				}
			}
			list[id].add(new Pair(key, value));
			++cnt;

			if (cnt > sz) {
				changeSize(2 * sz);
			}

			return;
		}

		long get(long key) {
			int id = hash(key);
			for (int i = 0; i < list[id].size(); ++i) {
				if (list[id].get(i).key == key) {
					return list[id].get(i).value;
				}
			}
			throw new AssertionError();
		}

		boolean containsKey(long key) {
			int id = hash(key);
			for (int i = 0; i < list[id].size(); ++i) {
				if (list[id].get(i).key != key) {
					continue;
				}
				return true;
			}
			return false;
		}

		int hash(long v) {
			return (int) ((a * v % p + b) % p % sz);
		}

		void changeSize(int sz_) {
			LinkedList<Pair>[] tmp = new LinkedList[sz];
			for (int i = 0; i < tmp.length; ++i) {
				tmp[i] = new LinkedList<>();
				tmp[i].addAll(list[i]);
			}
			sz = sz_;
			list = new LinkedList[sz];
			for (int i = 0; i < list.length; ++i) {
				list[i] = new LinkedList<>();
			}
			cnt = 0;
			for (int i = 0; i < tmp.length; ++i) {
				for (Pair p : tmp[i]) {
					put(p.key, p.value);
				}
			}
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}