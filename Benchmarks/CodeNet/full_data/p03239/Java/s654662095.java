import java.util.*;

class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int min = 1001;
      
      for(int i=0;i<N;i++){
        int c = sc.nextInt();  int t = sc.nextInt();
        if(t<=T){min = Math.min(c,min);}
      }
      System.out.println(min<1001?min:"TLE");
    }
}