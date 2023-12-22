import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int c[] = new int[n];
        int s[] = new int[n];
        int f[] = new int[n];
        for(int i = 0; i < n-1; i++){
          c[i] = sc.nextInt();
          s[i] = sc.nextInt();
          f[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n;i++){
          int t = 0;
          for(int j = i; j < n - 1;j++){
            if(t < s[j]){
              t = s[j];
            }else if(t % f[j] == 0){
            }else{
              t += f[j] - (t % f[j]);
            }
            t += c[j];
          }
          System.out.println(t);
        }
    }
}