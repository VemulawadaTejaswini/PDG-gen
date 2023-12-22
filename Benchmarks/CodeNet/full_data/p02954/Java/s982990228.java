import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		///int N=sc.nextInt();
		String S=sc.next();
		int N=S.length();
		char[] a=new char[N];
		int r=0;
		int[] pos=new int [N];
		for(int i=0;i<N;i++) {
			pos[i]=0;
		}
		int p=0;
		int l=0;
		for(int i=0;i<N;i++) {
			a[i]=S.charAt(i);
			if(a[i]=='R') {
				r++;
				if(l!=0) {
					if(l%2==1) {
						pos[p]+=l/2;
						pos[p+1]+=l/2+1;
					}else {
						pos[p]+=l/2;
						pos[p+1]+=l/2;
					}
				}
				p=i;
				l=0;
			}else {
				l++;
				if(r!=0) {
					if(r%2==1) {
						pos[p]+=r/2+1;
						pos[p+1]+=r/2;
					}else {
						pos[p]+=r/2;
						pos[p+1]+=r/2;
					}
				}
				r=0;
			}
			/*for(int j=0;j<pos.length;j++) {
				System.out.print(pos[j]+" ");
			}
			System.out.println();*/
		}
		if(l%2==1) {
			pos[p]+=l/2;
			pos[p+1]+=l/2+1;
		}else {
			pos[p]+=l/2;
			pos[p+1]+=l/2;
		}
		for(int j=0;j<pos.length;j++) {
			System.out.print(pos[j]+" ");
		}
	}
}
