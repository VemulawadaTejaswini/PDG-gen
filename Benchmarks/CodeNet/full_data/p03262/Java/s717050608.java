import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    int X = sc.nextInt(); 
    int[] x = new int[N];  
    for (int i=0; i < N ;i++) {
      x[i] =  Math.abs(sc.nextInt()-X);
    }
    if(x.length==1){
      System.out.println(x[0]);
    }else{
      int tmp = x[0];
      for(int i = 0; i < N; i++){
        tmp = gcd(tmp,x[i]);
      }
      System.out.println(tmp);
    }
  }

  static int gcd(int a, int b){
    int max= Math.max(a,b);
    int min= Math.min(a,b);
    if(max%min==0){
      return min;
    }else{
      return gcd(max%min, min);
    }
  }  
}

