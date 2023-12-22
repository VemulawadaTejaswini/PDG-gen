import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] k=new long[n];
		for(int i=0; i<n; i++){
			k[i]=sc.nextLong();
		}
		Arrays.sort(k);
		char[][] a=new char[n][100];
		for(int i=0; i<n; i++){
			String s=Long.toBinaryString(k[i]);
			int j=99;
			for(j=99; j>99-s.length(); j--){
				a[i][j]=s.charAt(s.length()-1+j-99);
			}
			for(int l=0; l<=j; l++){
				a[i][l]='0';
			}
		}
		for(int i=0; i<n; i++){
			int y=(i-1+n)%n;
			int t=(i+1+n)%n;
			for(int j=0; j<100; j++){
				if(a[y][j]==a[t][j] && a[i][j]=='1'){
					
					System.out.println("No");
					return;
				}else if(a[y][j]!=a[t][j] && a[i][j]=='0'){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}


