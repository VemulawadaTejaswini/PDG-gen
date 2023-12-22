import java.util.*;

public class Main {
    public static double min(double a,double b){
        return (a<b)?a:b;
    }
    
    public static double max(double a,double b){
        return (a>b)?a:b;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        double A=(double)a;
        double B=(double)b;
        
        double minA=12.5*A;
        double maxA=12.5*(A+1)-1;
        double minB=10*B;
        double maxB=10*(B+1)-1;
        
       for(int i=0;i<100000;i++){
           if(i>=minA&&i<=maxA&&i>=minB&&i<=maxB){
               System.out.println(i);
               return;
           }
       }
       
       System.out.println(-1);
    }
}
