import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    int ans,tmp;
    public void input(){
        ArrayList<Integer> li = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        li.add(sc.nextInt());
        li.add(sc.nextInt());
        li.add(sc.nextInt());
        Collections.sort(li);
        Collections.reverse(li);
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            li.set(0, li.get(0) * 2);
        }
        ans = li.get(0) + li.get(1) + li.get(2);
        sc.close();
        System.out.println(ans);
    }
    
}