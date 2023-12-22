import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ArrayList<Integer> aList = new ArrayList<>();
		ArrayList<Integer> bList = new ArrayList<>();
		ArrayList<Integer> finalList = new ArrayList<>();
		int result = 0;

		//　aの約数を取得
		for(int i = 1; i <= a; i++) {
			if(a%i == 0) {
				aList.add(i);
			}
		}
		//　bの約数を取得、かつaとの公約数を取得
		for(int i = 1; i <= b; i++) {
			if((aList.contains(i)) && (b%i == 0)) {
				bList.add(i);
			}
		}
		//　公約数の中ですべての組み合わせを列挙
		for(int i = bList.size(); 0 <= i; i--) {
			ArrayList<Integer> resultList = new ArrayList<>();
			for(int h = i-1; 1 <= h; h--) {
				if(bList.get(i-1) % bList.get(h-1) == 0) {
					resultList.add(i);
				}
			}
			//　互いに素（割り切れるのは1のみ）になる場合のみ結果に入れる
			if(resultList.size() == 1) {
				finalList.add(i);
			}
		}
		
		//　1の場合を追加して出力
		System.out.print(finalList.size() + 1);
		sc.close();
	}
}
