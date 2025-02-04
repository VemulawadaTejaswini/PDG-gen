import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] canComeFrom1 = new boolean[N+1];
        boolean[] canGoToN = new boolean[N+1];
        for(int i=0;i<=N;i++){
        	canComeFrom1[i] = false;
        	canGoToN[i] = false;
        }
        for(int i=0;i<M;i++){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	if(a==1) canComeFrom1[b]=true;
        	if(b==N) canGoToN[a]=true;
        }
        boolean ans = false;
        for(int i=1;i<=N;i++) if(canComeFrom1[i]&&canGoToN[i]) ans=true;
        
        if(ans)System.out.println("POSSIBLE");
        else System.out.println("IMPOSSIBLE");
    }
}