import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int C = Integer.parseInt(sc.next());
      int D = Integer.parseInt(sc.next());
      int E = Integer.parseInt(sc.next());
      int F = Integer.parseInt(sc.next());
      int[] res = new int[3];
      int a = 100*A;
      int b = 100*B;
      for(int i = 0; i<30; i++){
        if(a*i > F) break;
        for(int j = 0; j<30; j++){
            int w = a*i+b*j;
            if(w == 0) continue;
            if(w > F) break;
            else{
                int lim = w*E/100;
                for(int k = 0; k<lim; k++){
                  for(int l = 0; l<lim; l++){
                    int s = k+j;
                      if(s>lim) break;
                      if(s<=lim && w+s <= F){
                        int noudo = s*100/(s+w);
                          if(res[2]<=noudo){
                            //System.out.println("i,j,k,l = "+i+" "+j+" "+k+" "+l);
                            res[0] = s+w;
                            res[1] = s;
                            res[2] = noudo;
                          }
                      }
                  }
                }
            }
        }
      }
      System.out.println(res[0]+" "+res[1]);
  }
}