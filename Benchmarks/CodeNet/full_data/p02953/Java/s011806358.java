import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		for(int i = 0; i < a; i++){
			h.add(sc.nextInt());
		}
		boolean flg = true;
		for(int i = h.size()-1; i >= 0; i--){
			for(int j = 0; j < i; j++){
				if(h.get(j)-h.get(i) >= 2){
					flg = false;
				}
			}
		}
		if(flg){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
