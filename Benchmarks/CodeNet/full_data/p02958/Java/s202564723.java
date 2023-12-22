import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int p[] = new int[N];
    boolean out = false;
    for (int i=0; i<N; i++) {
      p[i] = sc.nextInt();
    }

    out = hantei(p, N);

    if(!out){
      loop:for(int i=0; i<N-1; i++) {
        for (int j=i+1; j<N; j++) {
          int temp = 0;
          temp = p[i];
          p[i] = p[j];
          p[j] = temp;
          if(hantei(p, N)){
            out = true;
            break loop;
          } else {
            temp = p[j];
            p[j] = p[i];
            p[i] = temp;
          }
        }
      }
    }

    if(out){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  public static boolean hantei(int p[], int N){
    boolean out = false;
    for (int i=0; i<N-1; i++) {
      if(p[i] > p[i+1]){
        break;
      }
      if(i == N-2){
        out = true;
      }
    }
    return out;
  }
}