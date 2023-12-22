import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int m = sc1.nextInt();
		Long[] list1 = new Long[n];
		Long[] list2 = new Long[n];
		Long[] list3 = new Long[n];
		Long[] list4 = new Long[n];
		Long[] list5 = new Long[n];
		Long[] list6 = new Long[n];
		Long[] list7 = new Long[n];
		Long[] list8 = new Long[n];

		for (int i = 0 ; i < n ; i++ ) {
			Long x = sc1.nextLong();
			Long y = sc1.nextLong();
			Long z = sc1.nextLong();

			list1[i] =  x + y + z;
			list2[i] = -x + y + z;
			list3[i] =  x - y + z;
			list4[i] =  x + y - z;
			list5[i] = -x + y - z;
			list6[i] = -x - y + z;
			list7[i] =  x - y - z;
			list8[i] = -x - y - z;
		}

		Arrays.sort(list1, Comparator.reverseOrder());
		Arrays.sort(list2, Comparator.reverseOrder());
		Arrays.sort(list3, Comparator.reverseOrder());
		Arrays.sort(list4, Comparator.reverseOrder());
		Arrays.sort(list5, Comparator.reverseOrder());
		Arrays.sort(list6, Comparator.reverseOrder());
		Arrays.sort(list7, Comparator.reverseOrder());
		Arrays.sort(list8, Comparator.reverseOrder());

		Long[] anslist = new Long[8];
		anslist[0] = 0L;
		anslist[1] = 0L;
		anslist[2] = 0L;
		anslist[3] = 0L;
		anslist[4] = 0L;
		anslist[5] = 0L;
		anslist[6] = 0L;
		anslist[7] = 0L;

		for (int j = 0 ; j < m ; j++) {
			anslist[0] += list1[j];
			anslist[1] += list2[j];
			anslist[2] += list3[j];
			anslist[3] += list4[j];
			anslist[4] += list5[j];
			anslist[5] += list6[j];
			anslist[6] += list7[j];
			anslist[7] += list8[j];
		}

		Arrays.sort(anslist, Comparator.reverseOrder());

		System.out.println(anslist[0]);

		sc1.close();

	}

}