import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<dish> li = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            dish d = new dish(sc.nextInt());
            li.add(d);
        }
        li.sort((a,b) -> a.rem-b.rem);
        int ans = 0;
        for(int i = 0; i < 5; i++){
            ans += li.get(i).time;
            if(i != 4){
                ans += li.get(i).rem;
            }
        }
        System.out.println(ans);
    }
}

class dish{
    int time;
    int rem;
    public dish(int t){
        this.time = t;
        this.rem = (10-(t%10))%10;
    }
}