import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		Structure[] s = new Structure[n];
		
		for(int i = 0; i < n; i++){
		    s[i] = new Structure(i + 1, sc.nextInt());
		}
		Arrays.sort(s);
		
		// 計算
		//int result = 0;

		// 出力
		for(int i = 0; i < n; i++){
		    System.out.print(s[i].id + " ");
		}
        
	}
}

class Structure implements Comparable<Structure> {
	int id;
	int num;

	Structure(int n, int s) {
		this.id = n;
		this.num = s;
	}

	@Override
	public int compareTo(Structure obj) {
	    // this > obj => 1
	    // this < obj => -1
	    // this == obj => 0
	    int order = 0;
	    
	    order = Integer.compare(this.num, obj.num);

		return order;
	}

	public String toString() {
		return String.valueOf(id);
	}
}