import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count = 0;
    long r = 0;
    long g = 0;
    long b = 0;
    for(int i =0; i < N; i++){
        char tmp = S.charAt(i);
        if(tmp=='R'){r++;};
        if(tmp=='G'){g++;};
        if(tmp=='B'){b++;};
    }
    long ans = r*g*b;
    for(int i = 0; i < N -2; i++){
      for(int j = i+1; j < N -1; j++){
        int k = 2*j-i;
        if(k<N){
        if(S.charAt(i)!=S.charAt(j)&S.charAt(j)!=S.charAt(k)&S.charAt(k)!=S.charAt(i)){
          ans--;
        }
      }
      }
    }
    System.out.println(ans);
  }

  
}


