

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> color=new HashMap<>();
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            if(!color.containsKey(u) && !color.containsKey(v)){
                color.put(u,0);
            }
            if(!color.containsKey(u)){
                if(w%2==0){
                    color.put(u,color.get(v));
                }
                else{
                    color.put(u,Math.abs(color.get(v)-1));
                }
            }
            else if(!color.containsKey(v)){
                if(w%2==0){
                    color.put(v,color.get(u));
                }
                else{
                    color.put(v,Math.abs(color.get(u)-1));
                }
            }

        }
        for(int i=1;i<=n;i++){
            System.out.println(color.get(i));
        }
    }
}