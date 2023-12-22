import java.awt.event.ComponentAdapter;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = Integer.parseInt(sc.next()); 
		Sub[] subList = new Sub[first];
		for(int i=0; sc.hasNext(); i++) {
			subList[i] = new Sub(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}
		if(subList.length == 1) {
			System.out.println(1);
		}else {
			Arrays.sort(subList,new Com());
			ArrayList sa = new ArrayList<String>();
			ArrayList<Integer> count = new ArrayList<Integer>();
			
			StringBuffer br;
			
			for(int i=0; i<subList.length; i++){
				for(int j=0; j<subList.length; j++) {
					br = new StringBuffer();
					if(i==j) {
						continue;
					}
					br.append(String.valueOf(subList[j].a - subList[i].a));
					br.append(String.valueOf(subList[j].b - subList[i].b));
					int exist = sa.indexOf(br.toString());
					if(exist == -1) {
						sa.add(br.toString());
						count.add(1);
					}else {
						count.set(exist, count.get(exist)+1);
					}
				}
			}
			int res = Collections.max(count);
			System.out.println(first - res);
		}
	}
}
class Sub{
	int a;
	int b;

	Sub(int a,int b){
		this.a = a;
		this.b = b;
	}
}
class Com implements Comparator<Sub> {
	@Override
	public int compare(Sub c1, Sub c2) {
		int x = c1.a - c2.a;
		int y = c1.b - c2.b;
		if(x>0) {
			return 1;
		}else if(x<0) {
			return -1;
		}else if(y>0) {
			return 1;
		}else if(y<0) {
			return -1;
		}else {
			return 0;
		}
	}
}




