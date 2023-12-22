//ｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｹｯｺｯｯｺｰｰｰｰ!!!!!!wwwwwwwwwww
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < n ; i++){
            w[i] = sc.nextInt();
            b += w[i];
        }
        a += w[0];
        b -= w[0];
        int yono = 1000000;
        for(int i = 1 ; i < n ; i++){
            yono = Math.min(yono , Math.abs(a - b));
            a += w[i];
            b -= w[i];
        }
        System.out.println(yono);
    }
}