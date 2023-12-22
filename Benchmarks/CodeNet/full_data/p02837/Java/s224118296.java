import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int A[][]=new int[16][16];//1:true 2:false
	int ans=N;
	for(int i=1;i<=N;i++) {
		int prrofnum=sc.nextInt();
		for(int j=0;j<prrofnum;j++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(y==0) {
				A[i][x]=1;
			}
		}
	}
	for(int i=1;i<=N;i++) {
		for(int j=1;j<=N;j++) {
				if(A[i][j]==1) {

					ans--;
					A[j][i]=0;
				}
			}
		}
	System.out.println(ans);

}
}