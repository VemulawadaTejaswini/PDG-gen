import java.util.*;

class Main{
    public static void sort(int[] x){
      for(int i = 0; i < x.length; i++){
        for(int j = i+1; j < x.length; j++){
          if(x[i] > x[j]){
            int  t = x[i];
            x[i] = x[j];
            x[j] = t;
          }
        }
      }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int x[] = new int[n];
        double ave = 0;
        for(int i = 0; i < n; i++){
          x[i] = stdIn.nextInt();
          ave += x[i];
        }
        int p = 0;
        ave = ave/(double)n;
        if(ave*10 % 10 >= 5) p = (int)(ave+1);
        else p = (int)ave;

        int ans = 0;
        for(int i = 0; i < n; i++)
          ans += (x[i] - p) * (x[i] - p);

        System.out.println(ans);
    }
}