import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=n+"";
		int a=sc.nextInt();
		int[] x=new int[10];
		String ss="";
		while(a-->0){
			x[sc.nextInt()]++;
		}
		for(int i=0;i<s.length();i++){
			for(int j=0;j<10;j++){
				if(x[j]!=1 && j>=s.charAt(i)-'0'){
					ss+=j;
					break;
				}
			}
			
		}
		System.out.print(ss);
		
	}
}
