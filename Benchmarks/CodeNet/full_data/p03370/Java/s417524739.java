import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();

    }
 
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int min = 10000000;
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            x -= m;
            if(min > m){
                min = m;
            }
        }
        int ans = n + (x/min);
        sc.close();
        System.out.println(ans);
    }

}