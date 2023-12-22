import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int input = sc.nextInt();
		int n[] = new int [input];
		for (int i=0 ; i<input ; i++ ){
			int v = sc.nextInt();
			n[i]=v;
		}
		int count = 0;
		int max = 0;
		for (int i=0 ; i<input ; i++ ){
			if(max<=n[i]){
				max = n[i];
				count +=1;
			}
		}
		System.out.println(count);
		
	}

}