import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] apple = new int[n];

        for(int i = 0; i < n; i++)
            apple[i] = l + i - 1;

        System.out.println(min);
        sc.close();  
    }

    static int abs_min(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (Math.abs(a[i]) < Math.abs(min))
                min = a[i];
        }
        return min;
    }
}