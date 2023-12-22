import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long N = sc.nextLong();
		long ret = 0;
		for (int i = 0; i <= S; i++){
			String hoge = String.valueOf(i);
			if(hoge.replace("0","").length() == N){
				ret++;
			}
		}
		System.out.println(ret);
	}
}	