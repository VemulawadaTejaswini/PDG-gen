//ｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｹｯｺｯｯｺｰｰｰｰ!!!!!!wwwwwwwwwww
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < m ; i++){
            b[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[n - 1] > b[0]){
            System.out.println("War");
        }else{
            boolean ebishu = true;
            for(int i = a[n - 1] + 1 ; i <= b[0] && ebishu ; i++){
                if(x < i && i <= y){
                    System.out.println("No War");
                    ebishu = false;
                }
            }
            if(ebishu)System.out.println("War");
        }
    }
}