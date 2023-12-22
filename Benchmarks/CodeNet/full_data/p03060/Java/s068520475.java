import java.io.*;
import java.util.*;
class Program{
    int N,v[], c[], arr[];
    ArrayList<Integer> sub_c = new ArrayList<Integer>();
    ArrayList<Integer> sub_v = new ArrayList<Integer>();
    ArrayList<Integer> p = new ArrayList<Integer>();
    Program(int v[], int c[], int N){
        this.v = v;
        this.c = c;
        this.N = N;
        this.arr = new int[N];
    }
    void solve(int i){
        if (i==N) p.add(price());
        else{
            sub_c.add(c[i]);
            sub_v.add(v[i]);
            solve(i+1);
            sub_c.remove(sub_c.size()-1);
            sub_v.remove(sub_v.size()-1);
            solve(i+1);
        }    
    }
    int ans(){
        return Math.max(0,Collections.max(p));
    }
    int price(){
        int sum = 0;
        for(int i=0;i<sub_c.size();i++) sum += sub_v.get(i) - sub_c.get(i);
        return sum;
    }
}
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int v []= new int[N];
        int c []= new int[N];
        for(int i=0;i<N;i++) v[i] = in.nextInt();
        for(int i = 0;i<N;i++) c[i] = in.nextInt();
        Program obj = new Program(v,c,N);
        obj.solve(0); System.out.println(obj.ans());
    }
}