//ｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｹｯｺｯｯｺｰｰｰｰ!!!!!!wwwwwwwwwww
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = new char[4];
        for(int i = 0 ; i < 4 ; i++){
            a[i] = s.charAt(i);
        }
        sc.close();
        Arrays.sort(a);
        if(a[0] == a[1] && a[1] != a[2] && a[3] == a[2]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}