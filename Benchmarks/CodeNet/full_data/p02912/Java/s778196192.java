import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stdR1 = br.readLine().split(" ");
        int N = Integer.parseInt(stdR1[0]);
        int M = Integer.parseInt(stdR1[1]);
        
        String[] stdR2 = br.readLine().split(" ");
        PDT pdt = new PDT(N, M);
        
        for(int i = 0; i < N; i++){
            pdt.pq.add(Integer.parseInt(stdR2[i]));
        }
        
        System.out.println(pdt.minCost());
    }
}


class PDT {
    int N;
    int M;
    Queue pq;
    
    public PDT(int N, int M){
        this.N = N;
        this.M = M;
        pq  = new PriorityQueue(N, new MyComparator());
    }
    
    public long minCost(){
        
        long sum = 0;
        Iterator iterator = pq.iterator();
        while(iterator.hasNext()){
            sum += (int)iterator.next();
        }
        
        for(int i = 0; i < M; i++){
            int x = (int)pq.poll();
            int xdiv = x / 2;
            pq.add(xdiv);
            sum = sum - x + xdiv;
        }
        
        return sum;
    }
    
}

class MyComparator implements Comparator {
    
    public int compare(Object obj1, Object obj2){
        int num1 = (int)obj1;
        int num2 = (int)obj2;
        
        if(num1<num2){
            return 1;
        }else if(num1>num2){
            return -1;
        }else {
            return 0;
        }
    }
    
}








