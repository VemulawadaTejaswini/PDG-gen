import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

		// Mapの宣言
        Map<String, Integer> mMap = new HashMap<String, Integer>();
		// Mapの宣言
        Map<Integer, Integer> mMap2 = new HashMap<Integer, Integer>();
        
		for (int i = 0; i < N;i ++ ){
			// 年、点数の入力
			mMap.put( sc.next() + " " + (100 - sc.nextInt()),i+1);
		}

		// キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);
        
        int cnt = 0;
        for (Object nKey : mapkey)
        {
//            System.out.println(nKey);
//            System.out.println(mMap.get(nKey));
            cnt ++;
			mMap2.put( cnt ,mMap.get(nKey));
        }
		
		// キーでソートする
        Object[] mapkey2 = mMap2.keySet().toArray();
        Arrays.sort(mapkey2);
        for (Object nKey2 : mapkey2)
        {
//            System.out.println(nKey2);
            System.out.println(mMap2.get(nKey2));
        }
		
//		System.out.println("ans");

   		sc.close();
        return ;

    }
    
}

