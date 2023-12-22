import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int ans = 0;
		int [] [] [] in = new int [n][n][2];
       
        for(int i=0;i<n;i++){in[n][0][0]=sc.nextInt();
                             for(int j=1;j<=in[n][0][0];j++){
                               for(int k=0;k<2;k++){in[j][k] = sc.nextInt();}}
                            }
        int max = 1;
        for(int i=0;i<n;i++){max*=2;}
        max--;
        int [] check = new int [n];  
        for(int i=0;i<=max;i++){int p = i; int count = 0; int bool = 0;
                                for(int j=0;j<n;j++){check[j]=p%2;p/=2;count+=(1+check[j])%2;}
                                for(int j=0;j<n;j++){if(check[j]==0){
                                                      for(int k=1;k<=in[j][0][0];k++)
                                                      {
                                                      if(check[in[j][k][0]-1]!=in[j][k][1])
                                                      {bool=1;}
                                                      }
                                                    }
                               if(bool==0){ans=Math.max(ans,count);}
                               }        
		System.out.println(ans);
}
}