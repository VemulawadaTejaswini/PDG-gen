import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n];
        int answer = 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sc.nextLine();
            answer += b[i]-a[i]+1;
        }
        System.out.println(answer);
    }
}