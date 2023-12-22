import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static boolean[] d=new boolean[10];
	static boolean check(int x){
		String str=Integer.toString(x);
		for(int i=0;i<str.length();i++) if(d[str.charAt(i)-'0']) return false;
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int k=sc.nextInt();
			Arrays.fill(d,false);
			for(int i=0;i<k;i++) d[sc.nextInt()]=true;
			for(int i=n;;i++){
				if(check(i)){
					System.out.println(i);
					break;
				}
			}
		}
	}
}