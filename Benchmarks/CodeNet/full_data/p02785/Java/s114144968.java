import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Long>hp=new ArrayList<>();
		
		//モンスターの数
		long N=sc.nextLong();
		//使える必殺技の回数
		long K=sc.nextLong();
		//フェネックの総攻撃回数
		long attackResult=0;
		long attack=0;
		
		
		//個々のモンスターの体力
		for(int i=0;i<N;i++) {
			hp.add(sc.nextLong());
			attackResult+=hp.get(i);
		}

		if(N>K) {
			
			//必殺技が使えるモンスターの体力をhpから削除
			for(int i=0;i<K;i++) {
				long maxMemory=Collections.max(hp);
				hp.remove(maxMemory);
				attackResult=attackResult-maxMemory;
			}
			
		
			System.out.println(attackResult);
		
		}else {
			System.out.println(0);
		}
	}

}
