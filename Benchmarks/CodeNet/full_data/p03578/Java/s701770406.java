import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for(int n=0;n<N;n++) D[n]=sc.nextInt();
        Arrays.sort(D);
        int M = sc.nextInt();
        int[] T = new int[M];
        for(int m=0;m<M;m++) T[m]=sc.nextInt();
        Arrays.sort(T);
        
        int i=0;
        int j=0;
        boolean ans=true;
        while(true){
        	if(j>=M){//problem set complete
        	    ans = true;
        	    break;
        	}
        	if(D[i]==T[j]){//you can use problem i
        	    i++;
        	    j++;
        	}
        	else if(D[i]<T[j]) i++;//you cannot use problem i
        	else if(D[i]>T[j]){//you do not have any problem for plan j
        	    ans = false;
        	    break;
        	}
        }
        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }
}