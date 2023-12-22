import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();

		int k = ((l-1)/2019 + 1)*2019; //L <= k
		if(l == 0){
			k = 0;
		}
		int ans;

		if(k <= r){
			ans = 0;
		}else{
			ans = (((l % 2019)*((l+1) % 2019))) % 2019;
		}

		//ArrayList<Integer> iarr = new ArrayList<Integer>();


		System.out.println(ans);
	}

}