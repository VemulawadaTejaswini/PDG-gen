import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] N2 = new int[N];
      int tmp = 0;
      int tmp2 = 0;
      int ans = 0;
		for(int i = 0;  i <  N  ; i++){
			N2[i] = sc.nextInt();
		}
		for(int i = 0;  i <  N  ; i++){
			int a = N2[i];
			int b = a;
			tmp = a * b / Math.min(a,b);
			tmp2 = tmp * N2[i] / Math.min(tmp,N2[i]);          
		}
		for(int i = 0;  i <  N  ; i++){
			if(tmp2 == N2[i]){ans++;}
			ans += N2[i] * tmp2;
		}
		System.out.println( tmp2 / ans);
      }
    }
