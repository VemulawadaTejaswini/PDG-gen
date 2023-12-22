import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<node> li = new ArrayList<node>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            node nd = new node(x,y);
            li.add(nd);
        }
        Boolean[] bools = new Boolean[n];
        Arrays.fill(bools,false);
        double ans = 0;
        for(int i = 0 ; i < n; i++){
            bools[i] = true;
            ans += totalLength(li,bools,i,(double)0);
            bools[i] = false;
        }
        System.out.println(ans/totalDivide(n));
    }
    
    private static double totalLength(List<node> li, Boolean[] bools, int now, double len){
        if(!Arrays.asList(bools).contains(false)){
            return len;
        }
        double ans = 0;
        for(int i = 0; i < li.size(); i++){
            if(bools[i]){
                continue;
            }
            double tmp = Calc2Roads(li.get(now), li.get(i));
            bools[i] = true;
            len += tmp;
            ans += totalLength(li,bools,i,len);
            bools[i] = false;
            len -= tmp;
        }
        return ans;
    }

    private static double totalDivide(int n){
        double ret = 1;
        for(int i = 1; i <= n; i++){
            ret *= i;
        }
        return ret;
    }

    private static double Calc2Roads(node n1,node n2){
        double x = Math.abs(n1.getX()-n2.getX());
        double y = Math.abs(n1.getY()-n2.getY());
        double len = Math.pow(x,2) + Math.pow(y,2);
        return Math.pow(len, 0.5);
    }
}

class node{
    private int x,y;
    public node(int x, int y){
        this.x = x;
        this.y = y;
    } 
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}