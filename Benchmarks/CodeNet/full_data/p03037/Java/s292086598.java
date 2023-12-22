import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];

        for(int i=0; i<m; i++){
          l[i] = sc.nextInt();
          r[i] = sc.nextInt();
        }
        int lMax = l[0];
        int rMin = r[0];
        for(int i=1; i<m; i++){
          if(lMax < l[i]) lMax = l[i];
          if(rMin > r[i]) rMin = r[i];
        }
        if(rMin-lMax<0) System.out.println("0");
        else System.out.println(rMin-lMax+1);
	}
}