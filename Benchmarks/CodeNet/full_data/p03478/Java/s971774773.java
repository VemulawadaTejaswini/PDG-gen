import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int tmp = 0,sum = 0;
        for(int i=0;i<=n;i++)
        {
            tmp = Digitsum(i);
            if(tmp>=a && b>=tmp)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
    static int Digitsum(int a){
        int sum=0;
        while(a>0)
        {
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}