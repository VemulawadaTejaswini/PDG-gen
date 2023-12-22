import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int cnt = 0;
      for(int i=0;i<=9;i++){
        String I = String.valueOf(i);
        int ii = s.indexOf(I);
        if(ii<0)continue;
        for(int j=0;j<=9;j++){
          String J = String.valueOf(j);
          int jj = s.indexOf(J,ii+1);
          if(jj<0)continue;
          for(int k=0;k<=9;k++){
            String K = String.valueOf(k);
            int kk = s.indexOf(K,jj+1);
            if(kk>0)cnt++;
          }
        }
      }
      System.out.println(cnt);
    }
}