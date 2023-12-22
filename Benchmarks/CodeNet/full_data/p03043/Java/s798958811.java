import java.util.*;
public class Main
{static int c=0;
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        double sum_power=0,count=0;
        if ((num>=1 && num<=100000) && (k>=1 && k<=100000)){
        for(int i=1;i<=num;i++){
            count=doublet(i,k);
        double p=Math.pow(2,count)*num;
            sum_power=sum_power+1/p;
            c=0;
        }
        System.out.println(sum_power);
    }
}

    static int doublet(int n,int f){
        if (n<f){
            c=c+1;
            return doublet(2*n,f);}
        else
            return c;}
        }

