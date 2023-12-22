




import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		ArrayList<Integer> diffList = new ArrayList<>();
		ArrayList<Integer> sameList = new ArrayList<>();

		int diff = a^b;

		for (int i=0;i<n;i++) {
			if ((diff&(1<<i)) > 0) {
				diffList.add(i);
			} else {
				sameList.add(i);
			}
		}
		if (diffList.size()%2==0) {
			System.out.println("NO");
		} else {


			int[] ans = construct(n,diffList.size());

			//digit swap
			System.out.println("YES");
			for (int i=0;i<ans.length;i++) {
				int tmp = 0;
				for (int j=0;j<diffList.size();j++) {
					//上からj桁目を下からget(j)桁目に
					tmp += ((ans[i]>>(n-j-1))%2)<<diffList.get(j);
				}
				for (int j=0;j<sameList.size();j++) {
					tmp += ((ans[i]>>j)%2)<<sameList.get(j);
				}

				System.out.print(tmp^a);
				if (i<ans.length-1) {
					System.out.print(" ");
				} else {
					System.out.println("");
				}
			}
		}



	}
	static int[] construct(int n, int a) {

		int size = 1<<n;

		if (a == 1) {
			// gray code

			int[] gray = new int[size];
			for (int i=0;i<size;i++) {
				gray[i]=i^(i>>1);

			}

			return gray;

		} else {
			int[] tmp = construct (n-1,a-2);



			int[] ans = new int[size];
			System.arraycopy(tmp, 0, ans, 0 ,size/2);
			for (int i=size/2;i<size;i++) {
				ans[i]=tmp[i-size/2]/2+(size/2)+(1-tmp[i-size/2]%2)*size/4;
			}
			return ans;
		}
	}


}
