import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		String[] s = sc.next().split("");
		int[] t = new int[n];
		t[0]=0;
		for(int i=1;i<t.length;i++){
			t[i]=t[i-1];
			if(isAC(s[i-1],s[i]))t[i]++;
		}
		int[] pnt=new int[q];
		for(int i=0;i<q;i++){
			int l= sc.nextInt()-1;
			int r= sc.nextInt()-1;
			pnt[i]=t[r]-t[l];
		}
		for(int i=0;i<pnt.length;i++)System.out.println(pnt[i]);
	}
	
	
	static boolean isAC(String x,String y){
		if(x.equals("A")&&y.equals("C"))return true;
		else return false;
	}
}