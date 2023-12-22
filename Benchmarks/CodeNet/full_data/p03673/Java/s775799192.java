import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		ArrayDeque<Integer> b = new ArrayDeque<Integer>();
		boolean flg = true;
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    if(flg){
		        b.addLast(a);
		    }else{
		        b.addFirst(a);
		    }
		    flg = !flg;
		}
		
		// 計算
		//int result = 0;
		
		// 出力
		while(!b.isEmpty()){
		    if(flg){
		        System.out.print(b.pollFirst());
		    }else{
		        System.out.print(b.pollLast());
		    }
		    System.out.print(" ");
		}
	}

}