import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0;i<n;++i){
            arr[i]=input.nextInt();
        }
        if(n==0 || n==1)
            System.out.println("0");
        else {
            dp[1]=Math.abs(arr[1]-arr[0]);
            for (int i = 2; i < n; ++i) {
                int ans = Integer.MAX_VALUE;
                int j = i-k;
                if(j<0)j=0;
                for(int l=j;l<i;++l){
                    int val = dp[l]+Math.abs(arr[i]-arr[l]);
                    ans = Math.min(ans,val);
                }
                dp[i]=ans;
            }
        }
        System.out.println(dp[n-1]);

    }
}
