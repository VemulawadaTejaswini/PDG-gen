import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		int onefirst = 0;
		for(int i = 0;i < ss.length();i++){		//1010101
			if(ss.charAt(i) == '0' && i%2 == 0){
				onefirst++;
			}else if(ss.charAt(i) == '1' && i%2 == 1 ){
				onefirst++;
			}
		}
		
		int zerofirst = 0;
		for(int i = 0;i < ss.length();i++){		//010101
			if(ss.charAt(i) == '1' && i%2 == 0){
				zerofirst++;
			}else if(ss.charAt(i) == '0' && i%2 == 1 ){
				zerofirst++;
			}
		}
		
		int ans = Math.min(onefirst, zerofirst);
		System.out.print(ans);
		
		
		
		
		
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


