import java.util.*;
class Main{
	public static void main(String[] argv){
		divisor();
	}
	static Scanner scan = new Scanner(System.in);
	public static void yard(){
		int a = scan.nextInt(), b = scan.nextInt();
		int area = (a-1)*(b-1);
		System.out.println(area);
	}
	//input: 1<=n<=200
	//n以下の奇数の内，約数をちょうど８個持つものの数を出力
	//①2*4, 2*2*2の３通り．
	public static void divisor(){
		int n = scan.nextInt();
		int count = 0;
		int[] prime = {3,5,7,11,13,17,19,23,29,31};//200以下の際に候補になりえる素数．
		
		//②指数が1と3のパターン
		if(n>=135){//a*3^3のパターン
			count++;
			if(n>=189)
				count++;
		}
		
		//③のパターン．全探索する．
		for(int i=0;i<prime.length;i++){
			for(int j=i+1;j<prime.length;j++){
				for(int k=j+1;k<prime.length;k++){
					if(prime[i]*prime[j]*prime[k]<=n)
						count++;
				}
			}
		}
		System.out.println(count);
	}
}