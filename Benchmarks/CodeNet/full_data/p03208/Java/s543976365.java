import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int k = sc.nextInt();

	List<Integer> h = new ArrayList<Integer>();

	for (int i = 1; i <= n; i ++){
	    h.add(sc.nextInt());
	}
	Collections.sort(h);

	int minsub = 1000000000;
	int sub;
	for (int i = 1; i <= n - (k-1); i ++){
	    sub = h.get(i-1 + k-1) - h.get(i-1);
	    if(sub < minsub){
		minsub = sub;
	    }
	}

	// 出力
	System.out.println(minsub);
    }
}
