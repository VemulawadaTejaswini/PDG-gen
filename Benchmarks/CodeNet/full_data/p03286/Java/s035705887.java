import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
			int sum = -n;
			int c=0;
		// スペース区切りの整数の入力
		if(n<0){
		
			for(int i=0;i<100;i++){
				if(sum!=0){sum=sum/2;c++;}
				if(sum<=1) break;
			}
			}
		String bin = Integer.toBinaryString(n);
		
		System.out.println(bin.substring(bin.length()-c-1));
		
	}
}