import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashMap<Integer,Integer>suu=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int errorCount=0;
 
		
		for(int i=0;i<M;i++) {
			int key=sc.nextInt();
			int value=sc.nextInt();
			if(suu.containsKey(key)&&!(suu.get(key)==value)) {
				errorCount++;
			}else {
				suu.put(key,value);
			}
		}
		
		for(int i=1;i<=N;i++) {
			if(i==1) {
				if(suu.containsKey(1)){
					if(suu.get(1)==0&&N!=1) {
						errorCount++;
					}
				}else if(!suu.containsKey(1)) {
					suu.put(1, 1);
				}
			}
			
			if(!suu.containsKey(i)) {
				suu.put(i, 0);
			}
		
			
			if(errorCount==0) {
				System.out.print(suu.get(i));
				}
		}	
	
		if(errorCount!=0) {
			System.out.println(-1);
		}else if(suu.size()==0) {
			System.out.println(1);
		}
	}
 
}