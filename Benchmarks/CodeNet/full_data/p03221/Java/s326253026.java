import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 1.N prefectures, and a total of M cities that belong to those prefectures.
 * 2.City i is established in year Yi and belongs to Prefecture Pi.
 * 3.there are no multiple cities that are established in the same year.
 * 4.a 12-digit ID number to each city
 * 5.If City i is the x-th established city among the cities that belong to 
 * Prefecture i, the first six digits of the ID number of City i is Pi, 
 * and the last six digits of the ID number is x
 * 6.if Pi or x (or both) has less than six digits, zeros are added to the left
 *  until it has six digits.
 *  
 *  N M
 *  P1 Y1
 *  :
 *  PM YM
 */
public class Main{
	static int N,M;
	static int P[],Y[];
	static String Answer[];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();//市辖区的个数
		M=sc.nextInt();//city的总个数
		P=new int[M];
		Y=new int[M];
		Answer=new String[M];
		
		for(int i=0;i<M;i++) {
			P[i]=sc.nextInt();
			Y[i]=sc.nextInt();
		}
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<M;i++) {
			set.add(P[i]);
		}
		
		Iterator iter=set.iterator();
		int temp=0;
		int val=0;
		while(iter.hasNext()) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			val=(int)iter.next();
			for(int i=0;i<M;i++) {
				if(P[i]==val) {
					list.add(Y[i]);
				}
			}
			
			Collections.sort(list);
			
			for(int i=0;i<M;i++) {
				if(P[i]==val) {
					temp=Y[i];
					Y[i]=(list.indexOf(temp)+1);
				}
			}
		}
		 
		int k=0;
		while(k<M) {
			StringBuffer sb=new StringBuffer();
			sb.append(calPStr(P[k]));
			sb.append(calPStr(Y[k]));
			
			Answer[k]=sb.toString();
			k++;
		}
		
		for(int i=0;i<Answer.length;i++) {
			System.out.println(Answer[i]);
		}
	}
	public static String calPStr(int p) {
		//System.out.println("2");
		String s=String.valueOf(p);
		StringBuffer sb=new StringBuffer();
		int cnt=0;
		if(s.length()<6) {
			cnt=6-s.length();
			for(int i=0;i<cnt;i++) {
				sb.append("0");
			}
		}
		
		sb.append(s);
		return sb.toString();
	}
}
