import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        long H = 0;
        for (int i=0;i<n;i++)h[i]=sc.nextInt();
        Arrays.sort(h);
        for (int i=0;i<n-k;i++)H+=h[i];
        System.out.println(H);
    }
}
