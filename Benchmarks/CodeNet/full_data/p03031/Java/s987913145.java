import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	static int count = 0;
	public static void main (String[] args) {

		Main main = new Main ();
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		ArrayList <Integer> list = new ArrayList <Integer>();
		int[] kugiri = new int[M];
		for (int index=0; index<M; index++) {
			int num = sc.nextInt();
			kugiri[index]=num;
			for (int index2=0; index2<num; index2++) {
				list.add(sc.nextInt());
			}
		}
		int[] kosuu = new int[M];
		for (int index=0; index<M; index++) {
			kosuu[index]=sc.nextInt();
		}
		boolean [] boo = new boolean [N];
		for (int index=0; index<N; index++) {
			boo[index]=false;
		}

		main.sousaku(N,boo,0,kugiri,list,M,kosuu);

		System.out.println(count);
	}
	private boolean hantei (int M, boolean[] boo, int[] kugiri, ArrayList <Integer> list, int[] kosuu) {
		boolean flag = true;
		int sum = 0;
		for (int index=0; index<M+1; index++) {
			int num = kugiri[index];
			int count2 = 0;
			for (int index2=0; index2<num; index2++) {
				if (boo[list.get(index2+sum)-1]) {
					count2++;
				}
			}
			if (count2%2!=kosuu[index]) {
				flag=false;
			}
			sum+=num;
		}
		return flag;
	}
	private  void  sousaku (int N, boolean[] boo, int index, int[] kugiri, ArrayList<Integer> list, int M, int[] kosuu) {

		Main main = new Main();
		if (index==N) {
			if (hantei(N,boo,kugiri,list,kosuu)) {
				count++;
			}
		} else {
			main.sousaku(N,boo,index+1,kugiri,list,M,kosuu);
			boo[index]=true;
			try {
				boo[index+1]=false;
			} catch (Exception e) {

			}
			main.sousaku(N,boo,index+1,kugiri,list,M,kosuu);
		}
	}
}