import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	long count=0;
	long ans=0;
	int AB[][]=new int[a][2];
	for(int i=0;i<a;i++) {
		int x=scan.nextInt();
		int y=scan.nextInt();
		AB[i][0]=x;
		AB[i][1]=y;
	}
	for(;;) {
		long min=1145141919;
		int bA=0;
		long basyO=0;
		for(int i=0;i<a;i++) {
			if(min>AB[i][0]) {
				min=AB[i][0];
				basyO=AB[i][1];
				bA=i;
			}
		}
		if(count+basyO>=b) {
			ans+=min*(b-count);
			break;
		}
		else {
			count+=basyO;
			ans+=min*basyO;
			AB[bA][0]=1145141920;
		}
	}
	System.out.println(ans);
	}
}
