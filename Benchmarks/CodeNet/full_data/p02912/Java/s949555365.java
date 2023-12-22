import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        PriorityQueue q = new PriorityQueue(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            q.add(sc.nextInt());
        }

        for(int i=0; i<M; i++){
            q.add((int)(q.poll())/2);
        }

        long res=0;

        while(!q.isEmpty()){
            res=res+(int)q.poll();
        }



        System.out.println(res);
        
        
        
        
        }
    }