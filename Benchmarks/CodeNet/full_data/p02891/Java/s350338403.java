import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		long k=sc.nextLong();
		long count=0;
		int cc=0;
		boolean t=false;
		for(int i=0; i<s.length; i++){
			if(s[i]==s[0]){
				cc++;
			}else{
				break;
			}
		}
		for(int i=0; i<s.length-1; i++){
			if(s[i]==s[i+1]){
				count++;
				s[i+1]='1';
			}
		}
		long ii=0;
		if(s[s.length-1]==s[0]){
			ii++;
			if(cc>0 && cc%2==0){
				s[120]=5;
				ii--;
			}
		}
		if(s.length==1){
			System.out.println(k/2);
			return;
		}
		System.out.println(count*k+(ii)*(k-1));
	}
}
