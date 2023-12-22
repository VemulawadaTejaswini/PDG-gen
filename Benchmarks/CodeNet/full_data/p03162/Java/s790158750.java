public class Main {
public static void main(String args[]){
 int t=0;
Scanner obj=new Scanner(System.in);
t=obj.nextInt();
if(t<1)
return 0;
int arr[][]=new int[t][3];
for(int i=0;i<t;i++){
for(int j=0;j<3;j++){
      arr[i][j]=obj.nextInt();
}
}
int dp[][]=new int[t][3];
dp[0][0]=Math.max(arr[0][1],arr[0][2]);
dp[0][1]=Math.max(arr[0][0],arr[0][2]);
dp[0][2]=Math.max(arr[0][1],arr[0][0]);
for(int i=1;i<t;i++){
           d[[i][0]=Math.max(dp[i-1][1]+arr[i][0],dp[i-1][2]+arr[i][0]);
            d[[i][1]=Math.max(dp[i-1][0]+arr[i][1],dp[i-1][2]+arr[i][1]);
              d[[i][2]=Math.max(dp[i-1][1]+arr[i][2],dp[i-1][0]+arr[i][2]);
}
System.out.println(math.max(dp[t-1][0],Math.max(dp[t-1][1],dp[t-1][2])));
}

}