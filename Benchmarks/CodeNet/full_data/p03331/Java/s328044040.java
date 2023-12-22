import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s=sc.nextLine().split("");
		int[] X =new int[s.length];
		int cnt=0;
		for(int i=0;i<s.length;i++){
			X[i]=Integer.parseInt(s[i]);
			cnt=cnt+X[i];
			if(X[i]==0){
				if(X[i-1]==1)cnt=cnt+9;
			}
		}
		System.out.println(cnt);
	}
}
