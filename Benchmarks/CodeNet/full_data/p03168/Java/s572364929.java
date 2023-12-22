import java.util.Scanner;
public class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	double ans=0;
      	double arr[]=new double[n+1];
      	for(int i=1;i<=n;i++) arr[i]=sc.nextFloat();
      	double grid[][]=new double[n+1][n+1];
      	for(int i=0;i<=n;i++){
        	for(int j=0;j<=n;j++){
            	if(i == 0 && j== 0) grid[i][j]=1;
              	else if(i == 0) grid[i][j]=0;
              	else if ( j == 0) grid[i][j]=grid[i-1][j]*(1-arr[i]);
              	else {
                	grid[i][j]=grid[i][j]+((1-arr[i])*grid[i-1][j] + (arr[i]*grid[i-1][j-1]));
                }
            }
        }
      	int start=n/2+1;
      	for(int i=start;i<=n;i++) ans+=grid[n][i];
      	System.out.println(ans);
          
    }
}