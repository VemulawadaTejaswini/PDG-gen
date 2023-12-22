import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		int K=scan.nextInt();
		long count=0;
		char c[]=S.toCharArray();
		int l=S.length();
		int flag=0;
		for(int k=1;k<l;k++){
			if(c[k]==c[k-1]){
				if(c[k]!='z')c[k]++;
				else c[k]='a';
				if(k!=l-1&&c[k]==c[k+1])c[k]++;
				count++;
			}
			else if(k==l-1&&c[l-1]==c[0]){
				count++;
				flag=1;
			}
		}
		
			count*=K;
			if(flag==1){
				count--;
			}
		System.out.print(count);
	}
	
	
}
