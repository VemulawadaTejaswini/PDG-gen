
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		long c = sc.nextLong();
		long d = sc.nextLong();
		Map<Long, Long> clist = new HashMap<>();
		Map<Long, Long> dlist = new HashMap<>();
		long tmp = c;
		while(tmp != 1) {
			for(long i = 2; i < c + 1; i++) {
				if(tmp % i == 0) {
					if(clist.containsKey(i)) {
						long value = clist.get(i);
						value++;
						clist.put(i, value);
					} else {
						clist.put(i, (long) 1);
					}
					c /= i;
				}
			}
		}
		tmp = d;
		while(tmp != 1) {
			for(long i = 2; i < d + 1; i++) {
				if(tmp % i == 0) {
					if(dlist.containsKey(i)) {
						long value = dlist.get(i);
						value++;
						dlist.put(i, value);
					} else {
						dlist.put(i, (long) 1);
					}
					d /= i;
				}
			}
		}
		BigInteger ans = a.subtract(b).add(new BigInteger("1"));
		BigInteger sub = b.divide(new BigInteger(Long.toString(c))).subtract(a.divide(new BigInteger(Long.toString(c))));
		if(a.mod(new BigInteger(Long.toBinaryString(c))).toString() == "0") {
			sub = sub.add(new BigInteger("1"));
		}
		ans = ans.subtract(sub);
		sub = b.divide(new BigInteger(Long.toString(d))).subtract(a.divide(new BigInteger(Long.toString(d))));
		if(a.mod(new BigInteger(Long.toBinaryString(d))).toString() == "0") {
			sub = sub.add(new BigInteger("1"));
		}
		ans = ans.subtract(sub);
		List<Long> list = new ArrayList<>();
		list.addAll(clist.keySet());
		Map<Long, Long> mul = new HashMap<>();
		while(!list.isEmpty()) {
			long key = list.get(0);
			list.remove(0);
			long cvalue = clist.get(key);
			clist.remove(key);
			if(dlist.containsKey(key)) {
				long dvalue = dlist.get(key);
				dlist.remove(key);
				mul.put(key, Math.max(cvalue, dvalue));
			} else {
				mul.put(key, cvalue);
			}
		}
		BigInteger multi = new BigInteger("1");
		list.clear();
		list.addAll(mul.keySet());
		while(!list.isEmpty()) {
			long key = list.get(0);
			list.remove(0);
			long value = mul.get(key);
			for(long i = 0; i < value; i++) {
				multi = multi.multiply(new BigInteger(Long.toBinaryString(key)));
			}
		}
		sub = b.divide(multi).subtract(a.divide(multi));
		if(a.mod(multi).toString() == "0") {
			sub = sub.add(new BigInteger("1"));
		}
		ans.add(sub);
		System.out.println(ans.toString());
	}

}
