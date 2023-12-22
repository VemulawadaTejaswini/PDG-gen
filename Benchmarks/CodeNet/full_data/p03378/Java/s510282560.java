import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int cost = 0;
        int cost2 = 0;
        boolean[] a = new boolean[n+1];

        Arrays.fill(a,false);

        for(int i = 0;i<m;i++){
            int num = sc.nextInt();
            a[num] = true;
        }

        for(int i = x+1;i<=n;i++){
            //System.out.println("cost : " + i);
            if(a[i]){
                cost++;
            }
        }

        for(int i = x-1;i>=0;i--){
            //System.out.println("cost2 : " + i);
            if(a[i]){
                cost2++;
               // System.out.println()
            }
        }
       // System.out.println(cost);
        //System.out.println(cost2);
        System.out.println(Math.min(cost,cost2));
        
    }
}
