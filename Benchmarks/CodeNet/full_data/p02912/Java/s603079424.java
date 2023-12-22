import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] cost = new double[n];
        double mode = 0.0;
        long ans = 0;
        for(int i = 0;i < n;i++){
            cost[i] = sc.nextDouble();
        }
        Arrays.sort(cost);
        double half = (cost[0]+cost[n-1])/4.0;

        for(int i = 0;i < n-1;i++){
            if(cost[i] >= half){
                cost[i] = cost[i]/2.0;
                m--;
                if(m == 0)
                break;
            }
        }
        cost[n-1] = cost[n-1]/Math.pow(2,m);

        for(int i = 0;i < n;i++){
            ans += cost[i];
        }
        System.out.println(ans);
        
    }
}

