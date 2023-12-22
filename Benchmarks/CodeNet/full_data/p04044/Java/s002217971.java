
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int L = sc.nextInt();
    List<String> slist = new ArrayList<>();
    
		// 文字列の入力
    for(int i=0; i<N; i++){
      slist.add(sc.next());
    }
    Collections.sort(slist);
    StringBuffer sb = new StringBuffer(L * N);
    for(String s: slist){
    sb.append(s);
    }
	}
}
