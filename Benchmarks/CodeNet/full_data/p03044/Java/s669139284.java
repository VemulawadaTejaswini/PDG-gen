import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] uv=new int[n-1][3];
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<3;j++)
			uv[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<(1<<n);i++){
			int[] c=new int[n+1];
			int p=i;
			for(int j=1;j<=n;j++){
				if(p%2==0)
					c[j]=0;
				else
					c[j]=1;
				
				p/=2;
			}
			boolean boo=true;
			for(int j=0;j<n-1;j++){
				if((c[uv[j][0]]==c[uv[j][1]])&&uv[j][2]%2!=0)
					boo=false;
			}
			if(boo){
				for(int k=1;k<=n;k++){
					System.out.println(c[k]);
				}
				return;
			}
		}	
	}
}