import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int K=sc.nextInt();
		int C=B-A;
		if(K>=C-1){
			K=C-1;
		}
		//int pointer=0;
		//int leng=S.length();
	
		boolean[] Nums= new boolean[C+1];// 2 [3 4 5 6 7] 8
		
		//System.out.println("Yes");	
		for(int i=0;i<K;i++){
		
			Nums[i]=true;
			Nums[C-i]=true;
		
		}
		//System.out.println(A);
		for(int i=0;i<C;i++){
			int n=0;
			if(Nums[i]){
				n=A+i;
				System.out.println(n);
			}
		}
		System.out.println(B);
	}
}