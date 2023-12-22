import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int sum = 0;
        int[] p = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            p[i] = Integer.parseInt(sc.next());
            max = Math.max(p[i],max);
            sum+=p[i];
        }
        System.out.println(sum-max/2);
        sc.close();
    }
    
}