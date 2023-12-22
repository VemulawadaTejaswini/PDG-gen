import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String args[]){

		//　定数
		// 入力値取得
		int num = 0;
		Scanner sc = new Scanner(System.in);
		String exp  = sc.next();
		String res  = sc.next();
		ArrayList<String> expects = new ArrayList<>();
		ArrayList<String> results = new ArrayList<>();

		// リストに格納
		for(int i=0;i<3;i++ ){
			expects.add(exp.substring(i,i+1));
			results.add(res.substring(i,i+1));

		}

		// 判定
		for(int j = 0;j<expects.size();j++){

			if(expects.get(j).equals(results.get(j))){
				num = num + 1;
			}
		}

		System.out.println(num);
	}
}