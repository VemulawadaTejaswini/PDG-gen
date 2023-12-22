import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		int k = sc.nextInt();
		long r = sc.nextLong();
		long s = sc.nextLong();
		long p = sc.nextLong();
		String t = sc.next();
		
		// 計算
		long result = 0;
		char[] list = new char[t.length()];
		
		for(int i = 0; i < t.length(); i++){
		    if(t.charAt(i) == 'r'){
		        if(i - k >= 0 && list[i-k] == 'p'){
		            list[i] = 'n';
		        }else{
		            result += p;
		            list[i] = 'p';
		        }
		    }
		    if(t.charAt(i) == 's'){
		        if(i - k >= 0 && list[i-k] == 'r'){
		            list[i] = 'n';
		        }else{
		            result += r;
		            list[i] = 'r';
		        }
		    }
		    if(t.charAt(i) == 'p'){
		        if(i - k >= 0 && list[i-k] == 's'){
		            list[i] = 'n';
		        }else{
		            result += s;
		            list[i] = 's';
		        }
		    }
		}
		
		
		
		// 出力
		System.out.println(result);
	}
}
