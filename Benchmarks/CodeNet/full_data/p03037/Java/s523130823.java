import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s=new int[n+1];
		for(int i=0; i<m; i++){
			int l=sc.nextInt()-1;
			int r = sc.nextInt()-1;
			s[l]++;
			s[r+1]--;
		}
		int count=0;
		if(s[0]>=m){
			count++;
		}
		for(int i=0; i<n-1; i++){
			s[i+1]+=s[i];
			if(s[i+1]>=m){
				count++;
			}
		}
		System.out.println(count);
	}
}
