import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}

		int[] l = new int[n+1];
		int[] r = new int[n+1];
		
		l[0] = 0;
		l[1] = a[0];
		r[n] = 0;
		r[n-1] = a[n-1];
		for(int i = 1;i < n;i++){
			l[i+1] = gcd(l[i],a[i]);
		}
		for(int i = n-2; i >= 0;i--){
			r[i] = gcd(a[i],r[i+1]);
		}
		
		
		int ans = 0;
		for(int i = 0;i+1 < n;i++){
			ans = Math.max(ans,gcd(l[i],r[i+1]));
		}
		for(int i = n-1;i >= n;i--){
			ans = Math.max(ans,gcd(l[i],r[i-1]));
		}
		System.out.print(ans);
	}
	
	
	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	




static String deletestr(String base,String remove){
	boolean flag = true;
	for(int i = 0;i < remove.length();i++){
		if(i == base.length()){
			flag = false;
			break;
		}
		if(base.charAt(i) - remove.charAt(i) != 0 && base.charAt(i) - remove.charAt(i) != 32 &&remove.charAt(i) - base.charAt(i)  != 32){
			flag = false;
			break;
		}
	}

	if(flag){
		base = base.substring(remove.length());
	}

	return base;

}



}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


