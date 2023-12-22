import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Shop implements Comparable<Shop>{
    String s; int p; int n;
    public Shop(String s, int p, int n){
        this.s = s;
        this.p = p;
        this.n = n;
    }
    @Override
    public int compareTo(Shop m){
        int i = (this.s).compareTo(m.s);
        if(i==0){
            int j = m.p - this.p;
            return j;
        }
        return i;
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Shop> m = new ArrayList<Shop>();
        for(int i=0; i<n; i++){
            String s = sc.next();
            int p = Integer.parseInt(sc.next());
            m.add(new Shop(s,p,i));
        }
        Collections.sort(m);
        for(int i=0;i<n;i++){
            System.out.println(m.get(i).n+1);
        }
        sc.close();
    }
}