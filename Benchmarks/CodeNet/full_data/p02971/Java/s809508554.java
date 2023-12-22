import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        for(int i = 0; i < n; i++)
            System.out.println(max_exp_i(a, i));
        sc.close();  
    }

    static int max_exp_i(int[] a, int i){
        int max;
        if(i == 0)
            max = a[1];
        else
            max = a[0];
        
        for(int j = 0; j < a.length; j++){
            if(j == i)
                continue;
            if(a[j] > max)
                max = a[j];
        }
        return max;
    }
}