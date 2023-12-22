import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		ArrayList<Integer> list_l = new ArrayList<Integer>();


		for(int i = 0 ;i < N;i++){
			list_l.add(sc.nextInt());
			
		}

		ArrayList<Integer> list_b = new ArrayList<Integer>();
		list_b = (ArrayList<Integer>) list_l.clone();
		//ソート
		Collections.sort(list_l);

		int cnt = 0;
		for(int i = 0 ;i < N;i++){
			if(list_l.get(i)!=list_b.get(i)) {
				cnt ++;
			}
		}

		if(cnt == 2 | cnt == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

   		sc.close();
        return ;

    }
    
}

