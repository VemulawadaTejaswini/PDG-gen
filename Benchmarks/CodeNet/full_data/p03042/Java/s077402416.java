import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		String str = sc.next();
		
		int forward = Integer.parseInt(str.substring(0,2));
		int back = Integer.parseInt(str.substring(2));
		//System.out.print(forward + " " + back);
		
		if(forward > 12 &&( back > 12 || back == 0)){
			System.out.print("NA");
		}else if(forward > 12){
			System.out.print("YYMM");
		}else if(forward == 0 && (back == 0 || back > 12)){
			System.out.print("NA");
		}else if(forward == 0){
			System.out.print("YYMM");
		}else if(back > 12){
			System.out.print("MMYY");
		}else if(back != 0){
			System.out.print("AMBIGUOUS");
		}else{
			System.out.print("MMYY");

		}
		
		
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


