import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String S=sc.next();
	String[] S2=S.split("");
	long[] hash=new long[1000];
	int karinum=0;
	int ans=0;
	for(int i=0;i<N-2;i++) {
		for(int j=i+1;j<N-1;j++) {
			for(int k=j+1;k<N;k++) {
				karinum=(Integer.parseInt(S2[i])*100+Integer.parseInt(S2[j])*10+Integer.parseInt(S2[k]));
				if(hash[karinum]==1) {
					continue;
				}else {
					ans++;
					hash[karinum]=1;
				}
				if(ans==1000) {
					System.out.println(ans);
					System.exit(0);
				}
			}
		}
	}
	System.out.println(ans);
}
}