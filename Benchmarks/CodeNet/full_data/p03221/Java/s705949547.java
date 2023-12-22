import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		Structure[] list = new Structure[m];
		for(int i = 0; i < m; i++){
		    int p = sc.nextInt();
		    int y = sc.nextInt();
		    String s = String.format("%06d", p);
		    list[i] = new Structure(i, p, y, s);
		}       
		Arrays.sort(list, (x, y) -> x.compareTo(y));
		//System.out.println(Arrays.toString(list));
		
		// 計算
		int result = 0;
		int oldP = 0;
		int num = 0;
		for(int i = 0; i < m; i++){
		    if(list[i].p != oldP){
		        oldP = list[i].p;
		        num = 1;
		        list[i].s = list[i].s + String.format("%06d", num);
		    }else{
		        num++;
		        list[i].s = list[i].s + String.format("%06d", num);
		    }
		}
		//ystem.out.println(Arrays.toString(list));
		Arrays.sort(list, (x, y) -> Integer.compare(x.id, y.id));
		// 出力
		for(int i = 0; i < m; i++){
		    System.out.println(list[i].s);
		}
	}
}

class Structure implements Comparable<Structure> {
	int id;
	int p;
	int y;
    String s;

	Structure(int id, int p, int y, String s) {
		this.id = id;
		this.p = p;
		this.y = y;
		this.s = s;
	}

	@Override
	public int compareTo(Structure obj) {
	    // this > obj => 1
	    // this < obj => -1
	    // this == obj => 0
	    int order = 0;
	    
		// 第1ソートキー
	    order = Integer.compare(this.p, obj.p);
	    // 第2ソートキー
		if(order == 0){
	        order = Integer.compare(this.y, obj.y);
	    }

		return order;
	}

	public String toString() {
		return "id:" + this.id + "p:" + this.p + " y:" + this.y + " s:" + this.s;
	}
}
