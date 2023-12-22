import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(),d=sc.nextInt(),x=sc.nextInt();
		
		int[] xs = new int[10];
		xs[0]=r*x-d;
		for(int i=1;i<10;i++) {
			xs[i]=r*xs[i-1]-d;
		}
		
		for(Integer i : xs)System.out.println(i);
		
	}

}
