import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count=0;
		int blueCount=0;
		
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
	
		
		for(int i=0;count<N;i++) {
				if(count<N&&i<A) {
					count++;
				if(A!=0) {
					blueCount++;
				}
				}else if(i<A+B) {
					count++;
			}
		}
		
		System.out.println(blueCount);
	
	}
 
}