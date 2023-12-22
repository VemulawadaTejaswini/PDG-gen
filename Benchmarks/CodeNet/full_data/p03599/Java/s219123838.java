import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
      
      	int neta = a * 100;
        int netb = b * 100;
      
      	float rate = 0;
      	int total = 0;
      	int s = 0;
      	

        for(int i = 0; i <= f / neta; i++){
          int left = f - neta * i;
          
          for(int j = 0; j <= left / netb; j++){
            int totalw = neta * i + netb * j;
            if(totalw == 0) continue;
            
            for(int k = 0; k <= totalw * e / 100 / c; k++){
              int netd = d * ((totalw * e / 100 - c * k) / d);
              int totals = netd + c * k;
              if(totalw + totals > f) continue;
              
              if(100 * totals / (totalw + totals) > rate){
                rate = 100 * (float)totals / (float)(totalw + totals);
                total = totalw + totals;
                s = totals;
              }
            }
          }
        }

        System.out.println(total + " " + s);
	}
}