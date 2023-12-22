import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        int[] ans;
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(in.next());
        }
        ans = arr.clone();
        int disty = arr[3] - arr[1];
        int distx = arr[2] - arr[0];
        // System.out.println(disty+" "+distx);
        if(arr[2] < arr[0]){
            if(distx < 0){
                ans[1] += distx;
                ans[3] += distx;
            }else{
                ans[1] -= distx;
                ans[3] -= distx;
            }
            
            if(disty < 0){
                ans[0] += disty;
                ans[2] += disty;
            }else{
                ans[0] -= disty;
                ans[2] -= disty;
            }
        }else{
            if(distx > 0){
                ans[1] += distx;
                ans[3] += distx;
            }else{
                ans[1] -= distx;
                ans[3] -= distx;
            }
            
            if(disty < 0){
                ans[0] += disty;
                ans[2] += disty;
            }else{
                ans[0] -= disty;
                ans[2] -= disty;
            }
        }
        System.out.println(ans[2]+" "+ans[3]+" "+ans[0]+" "+ans[1]);
    }
}