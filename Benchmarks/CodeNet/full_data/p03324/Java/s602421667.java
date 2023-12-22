import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      if(m==100)m=101;
      System.out.println((m==0)?0:(n==0)?m:(n==1)?m+"00":m+"0000");
    }
}
