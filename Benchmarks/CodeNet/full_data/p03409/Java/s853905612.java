import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		ArrayList<Integer[]> red = new ArrayList<Integer[]>();
		for(int i = 0; i < n; i++){
		    Integer[] r = new Integer[2];
		    r[0] = sc.nextInt();
		    r[1] = sc.nextInt();
		    red.add(r);
		}
		ArrayList<Integer[]> blue = new ArrayList<Integer[]>();
		for(int i = 0; i < n; i++){
		    Integer[] b = new Integer[2];
		    b[0] = sc.nextInt();
		    b[1] = sc.nextInt();
		    blue.add(b);
		}
		Collections.sort(red, (x, y) -> {
		    int d = x[0] - y[0];
		    if(d != 0) return d;
		    else return x[1] - y[1];
		});
		Collections.sort(blue, (x, y) -> {
		    int d = x[0] - y[0];
		    if(d != 0) return d;
		    else return x[1] - y[1];
		});
		
		// 計算
		int result = 0;
		for(int i = 0; i < red.size(); i++){
		    for(int j = 0; j < blue.size(); j++){
		        Integer[] r = red.get(red.size() - i - 1);
		        Integer[] b = blue.get(blue.size() - j - 1);
		        if(r[0] < b[0] && r[1] < b[1]){
		            result++;
		            red.remove(r);
		            blue.remove(b);
		            i--;
		            j--;
		            break;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}


