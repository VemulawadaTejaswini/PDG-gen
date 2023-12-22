import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();

    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int u = sc.nextInt();
        int x = sc.nextInt();
        
        if(x > c + u || x < c){
             System.out.println("NO");
        }else{
             System.out.println("YES");
        }
        
        sc.close();
    }


}