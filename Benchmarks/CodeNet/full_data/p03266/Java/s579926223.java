import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m%2==0){
          int n2=n;
        n=n+m/2;
          n/=m;
          n2/=m;
          System.out.println((int)(Math.pow(n,3))+(int)(Math.pow(n2,3)));
        }
      else{
        n/=m;
      System.out.println((int)(Math.pow(n,3)));
      }
    }
}
