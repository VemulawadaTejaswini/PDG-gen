
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();

		Map<Long,Integer> Map=new HashMap<Long,Integer>();

		for(int i=0;i<N;i++) {
			Map.put(sc.nextLong(),sc.nextInt() );
		}

		Object[] mapkey=Map.keySet().toArray();
		Arrays.sort(mapkey);

		int now_Drink=0;
		int Drink_count=0;
		long ans=0;


		for (Long nKey : Map.keySet())
        {

			now_Drink=Map.get(nKey);

			if(M < Drink_count+now_Drink) {
				now_Drink=(M-Drink_count);
			}

			ans+=(long)(now_Drink*nKey);
			Drink_count+=now_Drink;

			if(Drink_count==M) break;

        }

		System.out.println(ans);

		sc.close();
	}

}
