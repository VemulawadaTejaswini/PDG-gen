import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int a=sc.nextInt();int b=sc.nextInt();
      int p=1;
      double pd=-0.006*sc.nextInt()+a;
      for(int i=0;i<n-1;i++){
        double po=-0.006*sc.nextInt()+a;
        if(Math.abs(po-b)<Math.abs(pd-b)){
        	p=i+2;
            pd=po;
        }
      }
      System.out.println(p);
    }
}
