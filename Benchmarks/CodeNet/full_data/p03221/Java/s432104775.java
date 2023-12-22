import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	static int N,M;
	static int P[],Y[];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();//市辖区的个数
		M=sc.nextInt();//city的总个数
		P=new int[M];
		Y=new int[M];
		
		for(int i=0;i<M;i++) {
			P[i]=sc.nextInt();
			Y[i]=sc.nextInt();
		}
		
		int order=0;
		int k=0;
		while(k<M) {
			order=calOrder(P[k],Y[k]);
			System.out.println(calPStr(P[k])+calPStr(order));;
			k++;
		}
	}
	
	public static int calOrder(int p,int y) {
		//System.out.println("1");
		//计算在同一个辖区内，该城市是第几个建立的
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<M;i++) {
			if(P[i]==p) {
				list.add(Y[i]);
			}
		}
		
		Collections.sort(list);
		
		int temp=list.indexOf(y);
		
		return (temp+1);
	}
	
	public static String calPStr(int p) {
		String str = null;
		if(p<9) {
			str="00000"+String.valueOf(p);
		}
		if(p<99 && p>=10) {
			str="0000"+String.valueOf(p);
		}
		if(p<999 && p>=100) {
			str="000"+String.valueOf(p);
		}
		
		if(p<9999 && p>=1000) {
			str="00"+String.valueOf(p);
		}
		
		if(p<99999 && p>=10000) {
			str="0"+String.valueOf(p);
		}
		
		if(p<999999 && p>=100000) {
			str=String.valueOf(p);
		}
		
		return str;
	}
}