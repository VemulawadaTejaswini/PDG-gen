import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int num = n;

		List<Integer> array1 = new ArrayList<Integer>();

		int re = 0;
		int ans = 0;

		for ( int i = 0 ; i < n ; i++ ) {

			array1.add(sc1.nextInt());
		}

		for (int i = 0; i< n ; i++){

			List<Integer> array2 = new ArrayList<Integer>();

			array2= array1.subList(0,num);

			if (array2.indexOf(n-i) >= 0 ) {

				num = array2.indexOf(n-i);
				//System.out.println("数値" + temp_p[n-i] + ":" + num);
				re++;

			}
			else  {
				break;
			}

		}

		ans = n - re;

		System.out.println(ans);

		sc1.close();

	}

}