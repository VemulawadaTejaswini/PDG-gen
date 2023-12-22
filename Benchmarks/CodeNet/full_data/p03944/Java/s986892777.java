import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
          a[i] = sc.nextInt();
        }
      
        
        int minX = 0;
        int maxX = w;
        int minY = 0;
        int maxY = h;
        for(int i = 0; i < n; i++){
          if(a[i] == 1){
            minX = Math.max(minX,x[i]);
          }else if(a[i] == 2){
            maxX = Math.min(maxX,x[i]);
          }else if(a[i] == 3){
            minY = Math.max(minY,y[i]);
          }else if(a[i] == 4){
            maxY = Math.min(maxY,y[i]);
          }
        }
       
        
        int ans = (maxX - minX)*(maxY - minY);
        if(ans <= 0){
          System.out.println(0);
        }else{
          System.out.println(ans);
        }
      
	}
}