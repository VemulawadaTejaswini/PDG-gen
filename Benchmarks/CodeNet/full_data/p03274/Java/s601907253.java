import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
	    ArrayList<Integer> plus = new ArrayList<>();
	    ArrayList<Integer> minus = new ArrayList<>();
	    for(int i=0; i<n; i++) {
	        int x = Integer.parseInt(sc.next());
	        if(x < 0) minus.add(x);
	        else plus.add(x);
	    }
	    int min = 200000001;
	    int count = 0;
	    for(int i=0; i<minus.size(); i++) {
            if(minus.size()-i < k) {
                if(plus.size() != 0 && plus.size() >= k-(minus.size()-i)) {
                    count = Math.min(-minus.get(i) + plus.get(k-(minus.size()-i)-1)*2, -minus.get(i)*2 + plus.get(k-(minus.size()-i)-1));
                }else {
                    continue;
                }
            }else {
                count = -minus.get(i);
            }
            if(min > count) min = count;
	    }
	    for(int i=0; i<plus.size(); i++) {
            if(i+1 < k) {
                if(minus.size() != 0 && minus.size() >= minus.size() - (k-i)) {
                    count = Math.min(plus.get(i) + -minus.get(minus.size() - (k-(i+1)))*2, plus.get(i)*2 + -minus.get(minus.size() - (k-(i+1))));
                }else {
                    continue;
                }
            }else {
                count = plus.get(i);
            }
            if(min > count) min = count;
	    }
	    System.out.println(min);
    }
}