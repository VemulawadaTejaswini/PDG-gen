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
		//int K=sc.nextInt();
		int height=0;
		int Height=0;
		int difA=0;
		int difB=0;
		boolean x=true;
		//System.out.println("A:"+A+"B:"+B);
XX:		for(int i=1;x && i<1000;i++){
			height=Height;
			Height+=i;
			//System.out.println("he:"+height);
			for(int k=1;k<height;k++){
				difA=height-A;
				difB=Height-B;
				//if(i<10)System.out.println("difA:"+difA+",difB:"+difB);
				if(difA==difB){
					System.out.println(height-A);
					x=false;
					break XX;
				}
			}
			
		}
	}
}