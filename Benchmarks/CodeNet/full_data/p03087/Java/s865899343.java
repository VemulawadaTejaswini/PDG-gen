import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] line2 = line.split(" ",0);
		int N = Integer.parseInt(line2[0]);
		int Q = Integer.parseInt(line2[1]);
		String S = scan.nextLine();
		String T = "";
		String w = "";
		int l=1;
		int r=2;
		int counta=0;
		int total=0;
		int[] ans = new int[Q];
		for(int x=0;x<Q;x++){
			counta=0;
			total=0;
			l = scan.nextInt();
			r = scan.nextInt();
			T=S.substring(l-1,r);
			w=T.replace("AC","P");
			ans[x]=T.length()-w.length();
		}
		for(int z=0;z<Q;z++){
			System.out.println(ans[z]);
		}
	}
}