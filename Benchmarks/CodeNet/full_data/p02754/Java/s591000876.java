import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count=0;
		int blueCount=0;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Long> array=new ArrayList<>();
		long N=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
		
		for(int i=0;count<N;i++) {
			for(long blue=0;blue<A;blue++) {
				if(count<N) {
				//青いボールを１と仮定
				array.add((long)1);
				count++;
				}
			}
			
			for(long red=0;red<B;red++) {
				if(count<N) {
				//赤いボールを2と仮定
				array.add((long)2);
				count++;
				}
			}
		}
		
		for(long result:array) {
			if(result==1) {
				blueCount++;
			}
		}
		
		System.out.println(blueCount);
	}

}
