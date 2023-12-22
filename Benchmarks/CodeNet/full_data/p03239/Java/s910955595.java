import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        List<Object> list = new ArrayList<>();
		        int finish =0;
				int N = sc.nextInt();
				int T = sc.nextInt();
		        while( sc.next() !=null) {
		        	    Map aa = new HashMap();
				    // 整数の入力
		        	    int i = 0;
				    int c = sc.nextInt();
					int t = sc.nextInt();
					aa.put(c,t);
					list.add(aa);
					i++;
					finish =i;
					
		        }
		        
		        String s = "TLE";
		        for(int i = 1; i<=finish;i++) {
		        }
		        System.out.print(s);




	}

}