import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
          int A = sc.nextInt();
          int B = sc.nextInt();
          int C = sc.nextInt();
          int D = sc.nextInt();
          int E = sc.nextInt();
          int F = sc.nextInt();
          double maxden = 0.;
          double limden = E/(100+E);
          int ans1 = 0;
          int ans2 = 0;
          
          for(int i = 0; w + 100 * a + s < F;i++){
            w = 100 * A * i;
            for(int j = 0; w + 100 * b + s < F ;j++){
              w = w + 100 * B * j;
              	for(int t = 0;t <=30; t++){
                  s = t;
                  for(int k = 0;k <=30; k++){
                    s = s+k;
                    double den = 0;
                    if(w > 0){den = s/w+s}
                    if(den > maxden && den < limden){
                      ans1 = w+s;
                      ans2 = s;
                      maxden = den;
                    }
                  }
                }
            }
          }
                    
          System.out.println(ans1 + " " + ans2);
        }
    }
}