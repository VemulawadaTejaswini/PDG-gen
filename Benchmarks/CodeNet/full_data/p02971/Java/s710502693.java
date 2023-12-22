import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int max = 0;
        int max2 = 0;
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
            
            if(a[i] == max){
                max2 = max;
            }else{
                if(max < a[i]){
                    max2 = max;
                    max = Math.max(a[i],max);
                }else{
                    max2 = Math.max(a[i],max2);
                }
            }
        }
        for(int i = 0;i<n;i++){
            if(max == a[i]){
                System.out.println(max2);
            }else{
                System.out.println(max);
            }
            
        }
    }
}