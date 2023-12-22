import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		long ans = 0;

		// Mapの宣言
        Map<String, Integer> mMap = new HashMap<String, Integer>();
		// Mapの宣言
        Map<String, Integer> mstr = new HashMap<String, Integer>();
        
		for (int i = 0; i < N;i ++ ){
			// 文字列の入力
			String str = sc.next();

			String[] strArray = str.split("");
			 
//			// ソートする
			Arrays.sort(strArray);
	        String work = "";
			for (int j = 0; j < strArray.length; j++) {
	        	work = work + strArray[j];
			}

	        if(mMap.containsKey(work)){
	        	mMap.put( work,mMap.get(work) + 1);
	        	ans = ans + mMap.get(work);
	        }else {
	        	mMap.put( work,0);
	        }
		}

//        Object[] mapkey = mMap.keySet().toArray();
//        for (Object nKey : mapkey)
//        {
//        	if(mMap.get(nKey)>1) {
//                ans = ans + ( Factorial(mMap.get(nKey)) / 2 * Factorial((mMap.get(nKey) - 2)) );
//        	}
//        }

		
		System.out.println(ans);

   		sc.close();
        return ;

    }
    
    static long Factorial (int i) {
    	if (i == 0) {return 1;}

    	if (i == 1) {
    		return 1;
    	}else {
    		return (i * Factorial(i-1));
    	}
    }
}

