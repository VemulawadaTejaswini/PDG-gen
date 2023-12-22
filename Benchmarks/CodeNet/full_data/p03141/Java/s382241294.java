import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Food> foodbase = new ArrayList<Food>();

		for(int i=0;i<n;i++) {
			foodbase.add(new Food(sc.nextInt(),sc.nextInt(),i));
		}

		long Taka=0;
		long Aoki=0;

		ArrayList<Food> food1 = new MergeSort(foodbase,1).getList();
		ArrayList<Food> food2 = new MergeSort(foodbase,2).getList();


		//Collections.sort(food,(s1,s2) -> s2.max - s1.max);
		for(int i=0;i<n;i++) {
//			for(int k=0;k<food1.size();k++) {
//				System.out.print(food1.get(k)+" ");
//			}
//			System.out.println();
//			for(int k=0;k<food2.size();k++) {
//				System.out.print(food2.get(k)+" ");
//			}
//			System.out.println();


			if(i%2==0) {
				Food tmp = food1.get(food1.size()-1);
				Taka+=tmp.Taka;

//				System.out.println(Taka);

				food1.remove(food1.size()-1);
				food2.remove(tmp);
				//fastremove(food2,food2.size()-1,tmp);
			}else {
				Food tmp = food2.get(food2.size()-1);
				Aoki+=tmp.Aoki;
				//System.out.println(tmp);
//				System.out.println(Aoki);

				food1.remove(tmp);
				//fastremove(food1,food1.size()-1,tmp);
				food2.remove(food2.size()-1);
			}
		}


		System.out.println(Taka-Aoki);

	}
	static void fastremove(ArrayList ar,int index,Food rem) {
		int tm= index + (index+ar.size())/2;
		for(int i=index;i<ar.size() && i<tm;i++) {
			if(ar.get(i).equals(rem)) {
				ar.remove(i);
				return ;
			}
		}
		tm= index - (index+ar.size())/2;
		for(int i=index;i>0 && i>tm;i--) {
			if(ar.get(i).equals(rem)) {
				ar.remove(i);
				return ;
			}
		}
		ar.remove(rem);
	}
}



class MergeSort {
	private Food read(int Index) {
		Food tempnum=list.get(Index);
		return tempnum;
	}
	private void set(int index,Food num) {
		list.set(index, num);
	}
	private void swap(int one,int two) {
		Food num=list.get(one);
		list.set(one, list.get(two));
		list.set(two, num);
	}
	ArrayList<Food> list;
	int k=1;
	public MergeSort(ArrayList<Food> tpli, int i) {
		list=tpli;
		k=i;
		mergeSort(0,list.size());
	}
	private void mergeSort(int left, int right) {
		if(right - left <= 1) return;
		int mid = ( left + right )/2;

		mergeSort(left,mid);
		mergeSort(mid,right);

		// 一旦「左」と「右」のソート結果をコピーしておく (右側は左右反転)
		ArrayList<Food> sublist = new ArrayList<Food>();
		for (int i = left; i < mid; ++i) {
			sublist.add(read(i));
		}
		for (int i = right-1; i >= mid; --i) {
			sublist.add(read(i));
		}

		// マージする
		int iterator_left = 0;                    // 左側のイテレータ
		int iterator_right = sublist.size() - 1; // 右側のイテレータ
		if(k==1)
			for (int i = left; i < right; ++i) {
				// 左側採用
				if (sublist.get(iterator_left).max < sublist.get(iterator_right).max) {
					set(i, sublist.get(iterator_left++));
				}
				// 右側採用
				else if(sublist.get(iterator_left).max > sublist.get(iterator_right).max){
					set(i, sublist.get(iterator_right--));
				}
				else if(sublist.get(iterator_left).Taka < sublist.get(iterator_right).Taka) {
					set(i, sublist.get(iterator_left++));
				}
				else {
					set(i, sublist.get(iterator_right--));
				}
			}
		else
			for (int i = left; i < right; ++i) {
				// 左側採用
				if (sublist.get(iterator_left).max < sublist.get(iterator_right).max) {
					set(i, sublist.get(iterator_left++));
				}
				// 右側採用
				else if(sublist.get(iterator_left).max > sublist.get(iterator_right).max){
					set(i, sublist.get(iterator_right--));
				}
				else if(sublist.get(iterator_left).Aoki < sublist.get(iterator_right).Aoki) {
					set(i, sublist.get(iterator_left++));
				}
				else {
					set(i, sublist.get(iterator_right--));
				}
			}
	}
	public ArrayList<Food> getList(){
		return list;
	}

}

class Food {
	int index;
	int Taka;
	int Aoki;
	int max;
	Food(int a,int b,int ind){
		Taka=a;
		Aoki=b;
		index=ind;
		max=Math.max(a, b);
	}
}
