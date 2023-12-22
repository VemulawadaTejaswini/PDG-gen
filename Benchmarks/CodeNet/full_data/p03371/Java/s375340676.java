import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();

    }
 
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int min = Math.min(x,y);
        
        if(a + b >= c * 2){
            ans += (c * 2) * min;
        }else{
            ans += (a + b) * min;
        }
        if(x > y){ //aピザ余り
            ans += Math.min(a,c * 2) * (x - y);
        }else if(x < y){
            ans += Math.min(b,c * 2) * (y - x);
        }
        System.out.println(ans);
    }

}