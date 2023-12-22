
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//
		// 入力
		//
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		Map<Integer,Integer> sc_map = new HashMap<Integer, Integer>();
		boolean isUnique = true;
		boolean isExist = true;
		
		for (int i=0; i<M; i++) {
			// 重複を取る、重複に矛盾があればその場でエラーとする
			int s = sc.nextInt();
			int c = sc.nextInt();
			
			// 存在チェック
			if(sc_map.containsKey(s)){
				int x = sc_map.get(s);
				if(x != c){
					// 重複に矛盾
					isUnique = false;
					break;
				}
			}else{
				sc_map.put(s, c);
			}
        }
        
        // ０チェック
		int answer = -1;
		if(N == 1){
			if(sc_map.containsKey(1)){
				answer = sc_map.get(1);
			}
		}else if(N == 2){
			if(sc_map.containsKey(1)){
				if(sc_map.get(1) == 0){
					isExist = false;
				}
				answer = sc_map.get(1)* 10;
			}
			if(sc_map.containsKey(2)){
				answer += sc_map.get(2);
			}

		}else if(N == 3){
			if(sc_map.containsKey(1)){
				if(sc_map.get(1) == 0){
					isExist = false;
				}
				answer = sc_map.get(1)* 100;
			}
			if(sc_map.containsKey(2)){
				if(sc_map.get(2) == 0){
					isExist = false;
				}
				answer += sc_map.get(2)* 10;
			}
			if(sc_map.containsKey(3)){
				answer += sc_map.get(3);
			}
		}

        if(isUnique && isExist){
    		System.out.println(answer);
        }else{
    		System.out.println(-1);
        }
		sc.close();
	}

}
