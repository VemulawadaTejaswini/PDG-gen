import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		//nは偶数
		int n = sc.nextInt();
		int[] v = new int[n];
		
		for (int i = 0; i < n; i++)
			v[i] = sc.nextInt();
		
		//奇数番目の数列を抜き出す
		int[] a = new int[n/2];
		//偶数番目の数列を抜き出す
		int[] b = new int[n/2];
		for (int i = 0; i < n/2; i++) {
			a[i] = v[2*i];
			b[i] = v[2*i+1];
		}
		
		//aの最頻値を求める
		int[] dataA = new int[n/2];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					dataA[i]++;
			}
		
		int maxA = 0;
		for (int i = 0; i < a.length; i++)
			maxA = Math.max(maxA, dataA[i]);
		
		int fleqA = -1;
		for (int i = 0; i < a.length; i++) {
			if (dataA[i] == maxA)
				fleqA = a[i];
		}
		
		//bの最頻値を求める
		int[] dataB = new int[n/2];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b.length; j++) {
				if (a[i] == a[j])
					dataB[i]++;
			}
		
		int maxB = 0;
		for (int i = 0; i < b.length; i++)
			maxB = Math.max(maxB, dataB[i]);
		
		int fleqB = -1;
		for (int i = 0; i < b.length; i++) {
			if (dataB[i] == maxB)
				fleqB = b[i];
		}
		
		int count = 0;
		//aとbの最頻値が違った場合
		if (fleqA != fleqB) {
			for (int i = 1; i < a.length; i++) {
				if (a[i] != a[0])
					count++;
				if (b[i] != b[0])
					count++;
			}
			
			System.out.println(count);
		}
		//最頻値が同じだった時
		else {
			int secondFleqA = -1;
			int secondFleqB = -1;
			//フラグが‐1だったら見つけた
			int flag = 0;
			for (int i = maxA - 1; i > 0; i--) {
				for (int j = 0; j < a.length; j++) {
					if (dataA[j] == i) {
						secondFleqA = a[i];
						flag = -1;
						break;
					}
				}
				if (flag == -1) break;
			}
			
			flag = 0;
			for (int i = maxB - 1; i > 0; i--) {
				for (int j = 0; j < b.length; j++) {
					if (dataB[j] == i) {
						secondFleqB = b[i];
						flag = -1;
						break;
					}
				}
				if (flag == -1) break;
			}
			
			//Aの２番目の最頻値の方がBより多かったら
			//Aの方をその最頻値にそろえて
			//Bの方は１番目の最頻値にそろえる方が効率的
			if (secondFleqA > secondFleqB) {
				for (int i = 0; i < a.length; i++) {
					if (a[i] != secondFleqA)
						count++;
					if (b[i] != fleqB)
						count++;
				}
			}
			//Bの２番目の最頻値の方が大きかったらその逆
			//もし、AとBの２番目の最頻値も同じだったら
			//Aを１番目の最頻値に、Bを２番目の最頻値にそろえると決める
			else {
				for (int i = 0; i < a.length; i++) {
					if (b[i] != secondFleqB)
						count++;
					if (a[i] != fleqA)
						count++;
				}
				
				System.out.println(count);
			}
		}
	}

}