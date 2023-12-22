import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList a = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++){
			a.add(sc.nextInt());
		}
		Collections.sort(a);
		a.add(-1);

		ArrayList num = new ArrayList<Integer>();
		int tmp = (int)(a.get(0));
		int cnt = 0;
		for(int i = 0 ; i < n+1 ; i++){
			if(tmp == (int)(a.get(i))){
				cnt++;
			}else{
				tmp = (int)(a.get(i));
				num.add(cnt);
				cnt = 1;
			}
		}

		Collections.sort(num, Comparator.reverseOrder());

		int eN = num.size();
		int m = n;

		for(int i = 0 ; i < eN ; i++){
			System.out.println(Math.min(m,n/(i+1)));
			m -= (int)(num.get(i));
		}
		for(int i = eN ; i < n ; i++){
			System.out.println(0);
		}
	}
}