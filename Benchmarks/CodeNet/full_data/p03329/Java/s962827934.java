import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
                ArrayList<Integer> foo = new ArrayList<>();
                for(int i = 6; i<=200000; i=i*6) foo.add(i);
                for(int i = 9; i<=200000; i=i*9) foo.add(i);
                foo.add(1);
                Collections.sort(foo, Collections.reverseOrder());
                
                int cnt = 0;
                for(int i=0; i<foo.size(); i++){
                  while( N >= foo.get(i)) {
                    N = N - foo.get(i); cnt++;
                  }
                }
                
                
                
                
                
                
		// 出力
		System.out.println( cnt );
	}
}