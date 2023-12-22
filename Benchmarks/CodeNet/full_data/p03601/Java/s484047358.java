import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt()*100;
        int B = scan.nextInt()*100;
        int C = scan.nextInt();
        int D = scan.nextInt();
        int E = scan.nextInt();
        int F = scan.nextInt();
        
        Set<Integer> waterSet = new TreeSet<>();
        Set<Integer> sugarSet = new TreeSet<>();
        
        for(int i = 0; i*A <= F; i++) {
            for(int j = 0; i*A + j*B <= F; j++) {
                waterSet.add(i*A+j*B);
            }
        }
        
        for(int i = 0; i*C <= F/2; i++) {
            for(int j = 0; i*C + j*D <= F/2; j++) {
                sugarSet.add(i*C+j*D);
            }
        }
        
        float maxSugaredRate = 0;
        int maxWater = 0;
        int maxSugar = 0;
        
        for(int w : waterSet) {
            for(int s : sugarSet) {
                if(w + s > F) break;
                if(w / 100 * E < s) break;
                
                float fw = (float) w;
                float fs = (float) s;
                
                float sugaredRate = (float)(100 * fs / (fw+fs));
                if(maxSugaredRate < sugaredRate) {
                    maxSugaredRate = sugaredRate;
                    maxWater = w;
                    maxSugar = s;
                }
            }
        }
        System.out.println((maxWater + maxSugar) + " " + maxSugar);
    }
}
