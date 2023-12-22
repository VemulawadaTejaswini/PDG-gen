import java.util.*;
import java.lang.*;
import java.io.*;

class JoisinoPaper extends HashSet<Long>{
    public JoisinoPaper(){
        super();
    }
    public void call(long x){
        if(this.contains(x)) this.remove(x);
        else this.add(x);
    }
    public int count(){
        return this.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        JoisinoPaper paper = new JoisinoPaper();
        for(int n=0; n<N; n++) paper.call(sc.nextLong());
        System.out.println(paper.count());
    }
}
