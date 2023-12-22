import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i,m;
      int count = 0;
      int total = 0;
      for(i=1;i<=n;i+=2,count=0){
        for(m=1;m<=i;m++){
          if(i%m==0){
            count++;
          }
        }
        if(count==8){
          total++;
        }
      }
      
      System.out.println(total);
  }
}
