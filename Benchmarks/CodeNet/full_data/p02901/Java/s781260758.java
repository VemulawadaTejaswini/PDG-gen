
import java.util.Scanner;

 class Main {
    static int total;
    static int[] costs;
    static int[] treasures;
    static int min;
    static int[][] memo;

    static int dp(int key, int treasure){

        if(treasure==total){
            min=1000;
            return 0;
        }

        if(key >= costs.length)
            return Integer.MAX_VALUE;


        if(memo[key][treasure]!=0)
            return memo[key][treasure];

        int a =dp(key+1, treasure| treasures[key]) +costs[key];

        int b=dp(key+1, treasure);
        a=(a<0)? Integer.MAX_VALUE: a;
        b=(b<0)? Integer.MAX_VALUE: b;
        memo[key][treasure]=Math.min(a, b);
        return memo[key][treasure];
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        costs = new int[m];
        min=Integer.MAX_VALUE;
        treasures = new int[m];
        memo=new int[1001][9000];
        total=0;
        for(int i=0;i<n;i++){
            total=total | (1<<i);
        }
       //System.out.println("Total " + total);
        for(int i=0;i<m;i++){
            costs[i]=in.nextInt();
            int tres= in.nextInt();
            int t=0;
            for(int j=0;j<tres;j++){
                int k=in.nextInt();
                t|= (1 << (k-1));
            }
            treasures[i]=t;
        }
        int ans  = dp(0,0);
        if(min==Integer.MAX_VALUE) {
            int x=-1;
            System.out.println(x);
        }
        else
            System.out.println(ans);

    }
}
