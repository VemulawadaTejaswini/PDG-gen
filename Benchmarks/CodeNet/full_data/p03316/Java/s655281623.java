import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		String a =sc.next(); 
		int N = Integer.parseInt(a);
		int keta = String.valueOf(N).length();
		int S  = 0;
		for(int i =0;i < a.length();i++){
			S += Character.getNumericValue(a.charAt(i)); 
		}
		if(N%S==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}
			
			
			
			
	}
}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



