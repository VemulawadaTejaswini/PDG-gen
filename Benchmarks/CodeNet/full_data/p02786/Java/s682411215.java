import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long ans = 1;
        
        if(H>=2){
        
            int h = (int)H-1;
            h = (int)Math.abs(h);
            long[][] pows2 = new long[h][2];
            
            for(int i=0; i<pows2.length; i++){
                pows2[i][0] = (long)Math.pow(2, i+1);
                pows2[i][1] = 1;
                for(int r=1; r<=i+1; r++){
                    pows2[i][1] += (long)Math.pow(2, r);
                }
                
                
            }
            
            outer:
            for(double j=H; j>=0; j--){
                
                for(int k=pows2.length-1; k>=0; k--){
                    if(pows2[k][0]==j){
                        ans = pows2[k][1];
                        break outer;
                    }
                }
            }
        }
        System.out.println(ans);
        
    }
}
