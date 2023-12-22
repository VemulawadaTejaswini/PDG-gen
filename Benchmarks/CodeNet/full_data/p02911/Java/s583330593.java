import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer>rightAnswer=new HashMap<>();
		
		//参加者
		int N=sc.nextInt();
		//所持ポイント数
		int K=sc.nextInt();
		//正解の回数
		int Q=sc.nextInt();
		int[] array=new int[Q];
		
		
		//各回答者と持ちポイント数
		for(int i=0;i<N;i++) {
			rightAnswer.put(i,K);
		}
	
		
		//Qは問題数
		for(int i=0;i<Q;i++) {
			//正解者
			array[i]=sc.nextInt()-1;
			//jは正解の回数分の正解者を示す
			for(int j=0;j<N;j++) {
				if(j!=array[i]) {
					rightAnswer.put(j, rightAnswer.get(j)-1);
				
				}
			}
		}
	
		for(int i=0;i<N;i++) {
			if(rightAnswer.get(i)>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}