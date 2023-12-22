//package at_coder;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int time = sc.nextInt();
		Calc calc = new Calc(num+1);
		for(int i=0;i<num;i++) {
			calc.add(sc.nextInt());
		}

		for(int i=0;i<time;i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			for(int j=0;j<t;j++)
				if(calc.min() < x) {
					calc.arr[1] = x;
					calc.downHeap();
				}else {
					break;
				}
		}

		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum += calc.arr[i];
		}
		System.out.println(sum);
	}
}

public class Calc {

	int arr[];
	int length;

	Calc(int length){
		arr = new int[length];
		this.length = 0;
	}

	/*
	 * ヒープソート(最小または最大要素のみを参照できる配列)
	 * index 0 = 要素数
	 * index 1 = 参照要素
	 * 要素数より大きいindexにも値が入っている可能性がある
	 */

	//最小ヒープソートへの追加
	void add(int x) {
		int point = length + 1;
		for(point = length+1;point>1;point /= 2) {
			if(arr[point/2] > x)
				arr[point] = arr[point/2];
			else {
				arr[point] = x;
				break;
			}
		}
		if(point == 1)
			arr[1] = x;
		arr[0]++;
	}

	//最小ヒープソートから最小値を取り出す(参照配列に変化なし)
	int min() {
		return arr[1];
	}

	//最小ヒープソートから最小値を除く(参照配列は最小値を除く配列になる)
	void removeMin() {
		int x = arr[arr[0]];
		arr[0]--;
		int point = 1;
		while(point<=(arr[0])/2) {
			int child = arr[point*2] < arr[point*2+1] ? point*2 : point*2+1;
			if(arr[child] < x)
				arr[point] = arr[child];
			else {
				arr[point] = x;
				break;
			}
			point = child;
		}
		if(point*2 > arr[0])
			arr[point] = x;
	}


	/*
	 * root部分の要素を適切な位置におろす作業
	 */
	void downHeap() {
		int x = arr[1];
		int point = 1;
		while(point<=(arr[0])/2) {
			int child = arr[point*2] < arr[point*2+1] ? point*2 : point*2+1;
			if(arr[child] < x)
				arr[point] = arr[child];
			else {
				arr[point] = x;
				break;
			}
			point = child;
		}
		if(point*2 > arr[0])
			arr[point] = x;
	}
}