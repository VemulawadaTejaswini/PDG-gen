import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        Arrays.sort(a);
        
        int remove=0;
        int sameElement=1;
        for(int n=1;n<N;n++){
        	if(a[n]==a[n-1]){
        		sameElement++;
        	}else{
        		if(sameElement>=a[n-1]) remove += (sameElement-a[n-1]);
        		else remove += sameElement;
        		sameElement=1;
        	}
        }
        if(sameElement>=a[N-1]) remove += (sameElement-a[N-1]);
        else remove += sameElement;
        
        System.out.println(remove);
        
        
    }
}