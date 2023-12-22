import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Monmo momo = new Monmo(n);
        Monmo momo2 = new Monmo(n);
        List<Integer> plist = new ArrayList<Integer>();
        List<Integer> qlist = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            plist.add(p);
        }
        for(int i=0;i<n;i++){
            int q = sc.nextInt();
            qlist.add(q);
        }
        int psum=0;
        for(int i=0;i<n;i++){
            psum+=momo.check(plist.get(i))*fact(n-1-i);
        }
        int qsum=0;
        for(int i=0;i<n;i++){
            qsum+=momo2.check(qlist.get(i))*fact(n-1-i);
        }
        System.out.println((int)Math.abs((psum+1)-(qsum+1)));
        
    }
    
    static int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
    }
}

class Monmo {
    int n;
    List<Integer> list = new ArrayList<Integer>();
    
    Monmo(int n){
        this.n = n;
        for(int i=0;i<n;i++){
            list.add(i+1);
        }
    }
    
    int check(int c){
        for(int i=0;i<list.size();i++){
            if(c==list.get(i)){
                list.remove(i);
                return i;
            }
        }
        System.out.println("ここは通らない");
        System.exit(0);
        return 0;
    }
}

