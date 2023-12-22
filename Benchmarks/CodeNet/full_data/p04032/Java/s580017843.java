import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] al=new int[26];
		Arrays.fill(al,100000);
		for(int i = 0; i<s.length(); i++){
			if(i==al[s.charAt(i)-'a']+1 || i==al[s.charAt(i)-'a']+2){
				System.out.println((al[s.charAt(i)-'a']+1)+" "+(i+1));
				return;
			}
			al[s.charAt(i)-'a']=i;
		}
		System.out.println(-1+" "+-1);
	}
}