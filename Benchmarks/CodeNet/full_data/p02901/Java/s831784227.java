
import java.util.Scanner;

 class Main {
    static int total;
    static int[] costs;
    static int[] treasures;
    static int min;


    static void dp(int key, int treasure, int cost){
        if(key >= costs.length)
            return;
        if(treasure==total){
            min=Math.min(min, cost);
            return;
        }
        if(cost==Integer.MAX_VALUE)
            cost=0;
        dp(key+1, treasure| treasures[key], cost+costs[key]);
        dp(key+1, treasure, cost);
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        costs = new int[m];
        min=Integer.MAX_VALUE;
        treasures = new int[m];
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
        dp(0,0, Integer.MAX_VALUE);
        if(min==Integer.MAX_VALUE) {
            int x=-1;
            System.out.println(x);
        }
        else
            System.out.println(min);

    }
}
