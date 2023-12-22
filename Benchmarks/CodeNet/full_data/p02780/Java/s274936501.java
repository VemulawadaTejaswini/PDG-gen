import java.util.*;
import java.util.Comparator;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        int n=sc.nextInt();
        int k=sc.nextInt();
        double[] p=new double[n];
        //int id=0;
        double o=0;
        for(int i=0;i<n;i++){
        	p[i]=sc.nextDouble();
            if(i>=k-1){
                double a=0;
                for(int j=0;j<k;j++){
            		a+=(p[i-j]+1)/2;
                } 
                if(a>o)o=a;
            }
        }
        
      System.out.println(o);
    }
}