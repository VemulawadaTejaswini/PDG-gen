import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] road = new int[num];

        for(int i=0; i<num; i++){
            road[i] = sc.nextInt();
        }

        int Max = calcMax(road);
        int Min = calcMin(road);

        System.out.println(Max-Min);
    }

    public static int calcMax(int[] max){
        int ans = max[0];

        for(int i=0; i<max.length; i++){
            if(ans<max[i]){
                ans = max[i];
            }
        }
        return ans;
        
    }

    public static int calcMin(int[] min){
        int ans = min[0];

        for(int i=0; i<min.length; i++){
            if(ans > min[i]){
                ans = min[i];
            }
        }

        return ans;
    }
}