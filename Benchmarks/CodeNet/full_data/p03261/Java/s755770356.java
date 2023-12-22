import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] w = new String[n];
      int i;
      for(i=0;i<n;i++){
        w[i] = sc.next();
      }
      int count = 0;
      for(count=0;count<n-1;count++){
        for(i=0;i<n;i++){
          if(w[count].equals(w[i])){
            if(count!=i){
              System.out.println("No");
              System.exit(0);
            }
          }else{
            i++;
            continue;
          }
        }
        int leng = w[count].length();
        if(w[count].charAt(leng-1)!=w[count+1].charAt(0)){
          System.out.println("No");
          System.exit(0);
        }
        count++;
      }
      System.out.println("Yes");

  }
}
