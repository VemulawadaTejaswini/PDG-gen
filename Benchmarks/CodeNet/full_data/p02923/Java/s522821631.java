import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<Integer>masu=new ArrayList<>(); 
		
		int count=1;
		for(int i=0;i<n;i++) {
			masu.add(sc.nextInt());
		}
		
		for(int i=0;i<n;i++) {
			if(masu.get(i)<=i) {
				count++;
			}
		}
		System.out.println(count);

	}

}
