import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] c100=new int[2];
		c100[0]=0;
		int[] c10=new int[2];
		c10[0]=0;
		int[] c1=new int[2];
		c1[0]=0;
		boolean ju=true;
		for(int i=0;i<M;i++){
			int k=sc.nextInt();
			int j=sc.nextInt();
			//100の位
			if(k==1){
				if(c100[0]==0){
					c100[1]=j;
					c100[0]+=1;
				}
				if(c100[0]!=0){
					if(c100[1]!=j)
						ju=false;
				}
			}
			//10の位
			if(k==2){
				if(c10[0]==0){
					c10[1]=j;
					c10[0]+=1;
				}
				if(c10[0]!=0){
					if(c10[1]!=j)
						ju=false;
				}
			}
			//10の位
			if(k==3){
				if(c1[0]==0){
					c1[1]=j;
					c1[0]+=1;
				}
				if(c1[0]!=0){
					if(c1[1]!=j)
						ju=false;
				}
			}
		}
		if(!(ju)||c100[1]==0)
			System.out.print("-1");
		else{
			if(c100[0]==0)
				c100[1]=1;
			if(c10[0]==0)
				c10[1]=0;
			if(c1[0]==0)
				c1[1]=0;
			System.out.printf("%d%d%d",c100[1],c10[1],c1[1]);
		}
		}
}
