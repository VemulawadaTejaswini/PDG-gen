import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        final int INF = 2000000000;
        
        int[] start = new int[N+1];
        int[] end = new int[N+1];
        for(int i=0;i<N;i++){
        		start[i]=sc.nextInt();
        		end[i] = start[i]+T;
        }
        start[N]=INF;
        end[N]=INF;//avoid AIOOBException
        
        int s=0;
        int e=0;
        int time=0;
        int water=0;
        int ans=0;
        while(e<N){
        	if(start[s]==end[e]){
        		if(water>0){
        			ans += (start[s]-time);
        		}
        		time = start[s];
        		s++;
        		e++;
        	}else if(start[s]>end[e]){//end
        		if(water>0){
        			ans += (end[e]-time);
        		}
        		water--;
        		time = end[e];
        		e++;
        	}else{//start[s]<end[e] //start
        		if(water>0){
        			ans += (start[s]-time);
        		}
        		water++;
        		time = start[s];
        		s++;
        	}
        }
        
        System.out.println(ans);
    }
}