import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int L = sc.nextInt();


		String[] s = new String[N];

		for(int i=0;i<N;i++) {

			s[i] = sc.next();
		}

		ArrayList<Integer> sort = new ArrayList<Integer>();

		String ans = "";

		sort.add(0,0);	//最初にいれておく

		for(int i=1;i<N;i++) {	//順番に調べる

			compare_initial(s[i],sort,s,i);
		}

		for(int i=0;i<N;i++) {

			System.out.print(s[sort.get(i)]);
		}

	}

	//与えられた文字と今までの文字を比べる
	//与えられた文字列の添字がi
	public static void compare_initial(String a, ArrayList<Integer> sort, String[] s, int i) {

		int j = 0;	//前から調べる

		boolean flag = false;

		while(a.charAt(0)<=s[j].charAt(0) && j<i) {

			//もし頭文字が同じだったらcompare_s
			if(a.charAt(0) == s[j].charAt(0)) {

				compare_s(a,s,i,sort,j);

				flag = true;
			}

			j++;

		}

		int index;

		//compere_sがよばれていたら比べる必要ない
		if(!flag ) {

			if(j==1) {

				sort.add(0,i);

			}else {

				//渡されたiをs[j]の前にいれる
				index = sort.indexOf(j);

				sort.add(index, i);
			}
		}

	}

	//頭文字がおなじときに呼ばれるもの
	//iは与えられた文字列の添字
	public static void compare_s(String a, String[] s, int i, ArrayList<Integer> sort, int k) {

		int j = 2;

		//２文字目から
		int A = a.charAt(1);

		int B = s[k].charAt(1);

		int index = sort.indexOf(k);


		while(A==B && j<a.length()) {


			A += a.charAt(j);

			B += s[k].charAt(j);

			j++;
		}

		if(A>B){

			sort.add(index+1,i);

		}

		if(A<B) {

			sort.add(index,i);
		}



	}

}
