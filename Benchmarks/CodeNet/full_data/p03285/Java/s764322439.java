import java.util.*;
public class Main{
	static String SweetsJudge(int k){
		for(int i=0; i<=k/4; i++){
			if((k-4*i)%7==0)return "Yes";
		}
		return "No";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(SweetsJudge(n));
	}
}