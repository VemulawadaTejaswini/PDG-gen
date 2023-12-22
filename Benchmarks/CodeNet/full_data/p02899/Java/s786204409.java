import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
//		String ans = "";
		StringBuilder ans = new StringBuilder();

		// Mapの宣言
        Map<String,Integer> map = new HashMap<>();
        
		for (int i = 1; i <= N;i ++ ){
			// 文字列の入力
			String str = sc.next();

        	map.put( str,i);

		}

		for (int i = 1; i <= N;i ++ ){
//        	if(ans.isEmpty()) {
//            	ans = "" + map.get(i);
//            }else {
//            	ans = ans + " " + map.get(i);
//        	}
//    		System.out.println(map.get(String.valueOf(i))+" ");
			ans.append(map.get(String.valueOf(i))+" ");
		}


		System.out.println(ans);
		
   		sc.close();
        return ;

    }
    
}

