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

        double max=0;
        for(int i=1;i<=l-2;i++)
        {
            for(int j=1;j+i<=l-1;j++)
            {
                Math.max(max,i*j*(l-i-j));
            }
        }
        System.out.println(max);
    }
}