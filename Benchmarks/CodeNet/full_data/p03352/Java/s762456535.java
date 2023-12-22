import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= 32; i++){
            for(int j = 2; j < 10; j++){
                if((int)Math.pow(i,j) <= a &&(int)Math.pow(i, j) > ans){
                    ans = (int)Math.pow(i,j);  
                }
            }
        }
        sc.close();
        System.out.println(ans);
    }
    
    
}