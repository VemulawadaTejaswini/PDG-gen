import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      String[] s = new String[n];

      for(int i=0;i<n;i++){
        s[i] = sc.next();
      }

      char[][] c = new char[n][10];
      for(int i=0;i<n;i++){
        for(int j=0;j<10;j++){
          c[i][j] = s[i].charAt(j);
        }
      }

      for(int i=0;i<n;i++){
        Arrays.sort(c[i]);
      }

      String[] fin = new String[n];

      for(int i=0;i<n;i++){
        fin[i] = "";
        for(int j=0;j<10;j++){
            fin[i] += c[i][j];
        }
      }

      Arrays.sort(fin);

      String[] ffin = new String[n+1];
      for(int i=0;i<n;i++){
        ffin[i] = fin[i];
      }
      ffin[n] = "tarako";

//////////////////////////////////////////////

      long cnt = 1;
      long ans = 0;

      for(int i=0;i<n;i++){
      ///////////////////////////////////
      if(ffin[i].equals(ffin[i+1])){
        cnt++;
      }
      else{
        ans += cnt*(cnt-1)/2;
        cnt = 1;
      }

      ///////////////////////////////////
      }

      System.out.println(ans);

      /*for(int i=0;i<n;i++){
        System.out.println("fin[i]="+fin[i]);
      }*/

    }
}
