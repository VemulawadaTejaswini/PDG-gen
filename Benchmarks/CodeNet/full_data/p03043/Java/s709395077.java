import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        double p = 0;
        double max = 0;
        int a = 0;
        int c = 0;
        for(int i=1; i<=n; i++){
          if(i >= k && i != 1) {
            p += max / n;
            continue;
          }
          else {
            a = i;
            for(int j=1; j<100000; j++){
              a = a*2;
              if(a >= k) {
                c = j;
                break;
              }
              
            }
            if(i == 1) {
              //System.out.println(c);
              max = n*(Math.pow(2,c));
              //System.out.println(max);
              p += 1;
            }
            else p += max / (n*(Math.pow(2,c)));
        }
        }
        //System.out.println(p+" "+max);
        double result = p/max;
        System.out.println(result);
        }
}
