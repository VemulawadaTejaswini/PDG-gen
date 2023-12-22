import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashMap<Integer,Integer>suu=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int count=0;
		
		for(int i=0;i<M;i++) {
			suu.put(sc.nextInt(),sc.nextInt());
		}
		
		if(suu.size()!=0) {
		
		for(int i=1;i<=N;i++) {
			if(!suu.containsKey(i)) {
				if(i==1) {
					count++;
				}else {
					suu.put(i,0);
				}
			}
			
			if(count==0&&suu.get(1)!=0) {
				System.out.print(suu.get(i));
				}
		}	
	
		if(count!=0||suu.get(1)==0) {
			System.out.println(-1);
		}
		}else {
			for(int i=0;i<N;i++) {
				if(i==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
		}
	}

}