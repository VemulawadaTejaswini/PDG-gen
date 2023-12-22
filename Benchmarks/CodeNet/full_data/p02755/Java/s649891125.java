import java.math.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double ans =-1d;
        outloop: for(double i = 1.0;i<=1009.0;i=i+1.0){
            double ia =Math.floor(i*0.08);
            double ib =Math.floor(i*0.1);
            if(ia==a&&ib==b){
                ans =i;
                break outloop;
            }
            }
            int an =(int)ans;
            System.out.println(an);
        }
	}