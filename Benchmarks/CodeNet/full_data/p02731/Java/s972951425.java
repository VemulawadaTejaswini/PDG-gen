import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        if(l%3==0){
            double res=(l/3)*(l/3)*(l/3);
            System.out.println(res);
            return;
        }
        double x=l/3;
        double max=0;
        int total=l-l/3;
        for(int i=1;i<=total/2;i++)
        {
            max=Math.max(max,(total-i)*i);
        }
        System.out.println(x*max);
    }
}