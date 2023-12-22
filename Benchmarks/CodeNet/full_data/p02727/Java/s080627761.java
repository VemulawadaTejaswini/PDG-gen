import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

        // Mapの宣言
        Map<Integer, String> mMap = new HashMap<Integer, String>();

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int na = sc.nextInt();
		int nb = sc.nextInt();
		int nc = sc.nextInt();

		for (int i=0; i<na; i++) {
	        mMap.put( sc.nextInt(), "a");
		}
		for (int i=0; i<nb; i++) {
	        mMap.put( sc.nextInt(), "b");
		}
		for (int i=0; i<nc; i++) {
	        mMap.put( sc.nextInt(), "c");
		}
		sc.close();

        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey, Collections.reverseOrder());

        int ans = 0;
        int aa = 0;
        int bb = 0;
        int cc = 0;
        int max = x +y;
        int size = 0;
        for (Integer nKey : mMap.keySet())
        {
        	if (mMap.get(nKey) == "a") {
        		aa++;
        		if (aa <= x) {
        			ans += nKey;
        			size ++;
        		}
        	} else if (mMap.get(nKey) == "b") {
            	bb++;
            	if (bb <= y) {
            		ans += nKey;
            		size ++;
            	}
            } else {
            	ans += nKey;
            	size++;
            }

        	if (size ==max) break;

       	}


		System.out.println(ans);
	}
}
