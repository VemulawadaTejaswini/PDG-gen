import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int max1 = max(a);
        int max2 = sec_max(a);
        for(int i = 0; i < n; i++){
            if(max1 == a[i])
                System.out.println(max2);
            else
                System.out.println(max1);
        }
        sc.close();  
    }

    static int max(int[] a){
        return max1.sec_max(a);
    }

    static int sec_max(int[] a){
        int max1 = a[0];
        int max2 = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if(a[i] > max2){
                max2 = a[i];
            }
        }
        return max2;
    }
}