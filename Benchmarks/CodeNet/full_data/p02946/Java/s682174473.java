import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int x = sc.nextInt();

        int n = 2000001;

        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = -1000000 + i;
        
        for(int i = 0; i < k; i++)
            System.out.println(a[x-i]);
        for(int i = 1; i < k; i++)
            System.out.println(a[x+i]);
        sc.close();

    }
}