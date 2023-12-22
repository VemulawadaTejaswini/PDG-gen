import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1[] = new int[n+2];
        int a2[] = new int[n+1];
        a1[0] = 0;
        a2[0] = 0;
        int sum = 0;
        int subsum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<=n;i++){
            a1[i] = sc.nextInt();
        }
        sum1 = a1[1];
        a1[n+1] = 0;
        for(int i=1;i<=n;i++){
            a2[i] = sc.nextInt();
            sum2 += a2[i];
        }
        for(int i=1;i<=n;i++){
            subsum = sum1+sum2;
            if(subsum>sum){
                sum = subsum;
            }
            sum1 += a1[i+1];
            sum2 -= a2[i];
        }
        System.out.println(sum);
    }
}
