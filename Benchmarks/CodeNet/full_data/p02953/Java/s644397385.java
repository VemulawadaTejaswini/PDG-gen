import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static boolean isSort(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i) > list.get(i+1)) {
				return false;
			}
		}
		return true;
	}

	public static ArrayList<Integer> Sort(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++) {
			list.set(i,list.get(i)-1);
			if(isSort(list)) {
				return list;
			}
			list.set(i,list.get(i)+1);
		}
		return new ArrayList<>();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		if(isSort(list)) {
			System.out.println("Yes");
		}else if(Sort(list).isEmpty()) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}


		sc.close();
	}

}
