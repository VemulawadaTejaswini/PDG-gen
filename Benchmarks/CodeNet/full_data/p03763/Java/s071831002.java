import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int A[]=new int[26];
		int z=0,y=0;
		while(z<n){
			String a=stdIn.next();
			int G[]=new int[26];
			while(y<a.length()){
				char b=a.charAt(y);
				G[b-'a']++;
				y++;
			}y=0;
			while(y<26) {
				if(z==0||A[y]>G[y])
					A[y]=G[y];
				G[y]=0;
				y++;
			}y=0;
			z++;
		}z=0;
		while(z<26) {
			while(y<A[z]) {
				System.out.print((char)(z+97));
				y++;
			}y=0;
			z++;
		}
		System.out.println();
	}
}