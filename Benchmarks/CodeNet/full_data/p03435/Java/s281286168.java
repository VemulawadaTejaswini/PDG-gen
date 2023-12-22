import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// すべてのマスに入った値を取得
		ArrayList<Integer> all = new ArrayList<Integer>();
		for(int i = 0; i < 9 ; i++){
			all.add(sc.nextInt());
		}
		boolean takahashi = true;
		// test1
		Integer diff1 = all.get(3) - all.get(0);
		Integer diff2 = all.get(4) - all.get(1);
		Integer diff3 = all.get(5) - all.get(2);
		if(diff1 != diff2){
			takahashi = false;
		}else if(diff1 != diff3){
			takahashi = false;
		}
		// test2
		if(takahashi){
			diff1 = all.get(6) - all.get(3);
			diff2 = all.get(7) - all.get(4);
			diff3 = all.get(8) - all.get(5);
			if(diff1 != diff2){
				takahashi = false;
			}else if(diff1 != diff3){
				takahashi = false;
			}
		}
		// test3
		if(takahashi){
			diff1 = all.get(1) - all.get(0);
			diff2 = all.get(4) - all.get(3);
			diff3 = all.get(7) - all.get(6);
			if(diff1 != diff2){
				takahashi = false;
			}else if(diff1 != diff3){
				takahashi = false;
			}
		}
		// test4
		if(takahashi){
			diff1 = all.get(2) - all.get(1);
			diff2 = all.get(5) - all.get(4);
			diff3 = all.get(8) - all.get(7);
			if(diff1 != diff2){
				takahashi = false;
			}else if(diff1 != diff3){
				takahashi = false;
			}
		}
		if(takahashi){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}