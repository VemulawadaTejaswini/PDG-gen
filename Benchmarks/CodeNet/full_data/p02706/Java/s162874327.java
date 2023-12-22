import java.util.*;
import java.io.PrintWriter;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 高橋くんの夏休みN
		int N = Integer.parseInt(sc.next());
		// 夏休みの宿題M
		int M = Integer.parseInt(sc.next());
      
        int res = 0;
        for (int i=0; i<M; i++) {
          int day = Integer.parseInt(sc.next());
          res += day;
        }
		
		// res が N より大きかったら -1
      	if (res > N) {
          System.out.println("-1");
        } else {
          System.out.println(N-res);
        }
	}
}