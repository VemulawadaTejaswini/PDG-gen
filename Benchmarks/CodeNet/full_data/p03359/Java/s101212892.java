import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    int ans,tmp;
    public void input(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ans = a;
        if(a > b){
            ans--;
        }
        sc.close();
        System.out.println(ans);
    }
    
}