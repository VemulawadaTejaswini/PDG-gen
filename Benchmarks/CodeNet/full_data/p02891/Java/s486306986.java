import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		int K=scan.nextInt();
		long count=0;
		char c[]=S.toCharArray();
		int l=S.length();
		for(int k=1;k<l;k++){
			if(c[k]==c[k-1]){
				if(c[k]!='z')c[k]++;
				else c[k]='a';
				count++;
			}
		}
		
			count*=K;
		System.out.print(count);
	}
	
	
}
