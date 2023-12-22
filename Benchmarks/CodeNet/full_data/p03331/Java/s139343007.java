import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.split("");
		int[] X =new int[s.length];
		int cnt=0;
		for(int i=0;i<s.length;i++){
			X[i]=Integer.parseInt(s[i]);
			cnt=cnt+X[i];

		}
		int waru=1;
		for(int i=0;i<s.length-1;i++){
			waru=waru*10;
		}
			if(Integer.parseInt(str)%waru==0){
				cnt=cnt+9;
			}		
		
		System.out.println(cnt);
	}
}
