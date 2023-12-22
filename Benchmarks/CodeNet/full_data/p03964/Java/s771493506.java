import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t;
        long a;
        long anst=1;
        long ansa=1;
        long tmp;
        for(int i=0;i<n;i++){
            t=sc.nextInt();
            a=sc.nextInt();
            tmp=Math.max((anst-1)/t+1, (ansa-1)/a+1);
            anst=t*tmp;
            ansa=a*tmp;
        }
        System.out.println(anst+ansa);
    }
    
    
}