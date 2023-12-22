import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int w = sc.nextInt();
     	int h = sc.nextInt();
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        int a[] = new int[n];
        int ans;
        int yoko0 = 0,yoko = w,tate0 = 0,tate = h; 
        for(int i = 0;i < n; i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
          a[i] = sc.nextInt();
        }
        
      
        for(int i = 0;i < n;i++){
        	if(a[i] == 1 && yoko0 < x[i]){
              yoko0 = x[i];
            }else if(a[i] == 2 && yoko > x[i]){
              yoko = x[i];
            }else if(a[i] == 3 && tate0 < y[i]){
              tate0 = y[i];
            }else if(a[i] == 4 && tate > y[i]){
              tate = y[i];
            }
        }
        ans = (yoko - yoko0) * (tate - tate0);
        if(ans < 0){ans = 0;}
        System.out.println(ans);
    }
}