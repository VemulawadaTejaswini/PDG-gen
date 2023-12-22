import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();

    }
 
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int ans = 700;
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == 'o'){
                ans += 100;
            }
        }
        sc.close();
        System.out.println(ans);
    }

}