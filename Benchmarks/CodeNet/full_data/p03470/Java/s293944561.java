import java.util.*;

public class Main{

     public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n;
        int[] k = new int[101];
        int cnt = 0;
        
        for(int i = 1; i < 101; i++){
            k[i] = 0;
        }
        int count = 1;
        for(int i = 0; i<a; i++){
            k[i]++;
        }
        
        for(int j = 1; j< 101; j++){
            if(k[j] != 0)
            cnt++;
        }
        
        System.out.println(cnt);
     }
}