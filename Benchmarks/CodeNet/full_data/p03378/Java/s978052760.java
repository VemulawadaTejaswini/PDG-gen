import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int p = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> parkList = new ArrayList<Integer>();
        for(int i = 0; i < p; i++){
            parkList.add(sc.nextInt());
        }
        int zero = 0;
        int max = 0;
        Collections.sort(parkList);
        for(int i = 0; i < n; i++){
            if(parkList.contains(i)){
                zero++;
            }
        }
        for(int i = m; i > n; i--){
            if(parkList.contains(i)){
                max++;
            }
        }
        System.out.println(Math.min(zero,max));
        sc.close();
    }
    

}