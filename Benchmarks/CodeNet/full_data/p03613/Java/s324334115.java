import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] count = new int[100000];
        for(int i=0;i<N;i++) count[sc.nextInt()]++ ;
        
        
        int next = count[0]+count[1]+count[2];
        int ans = next;
        for(int i=3;i<100000;i++){
        	next = next - count[i-3] + count[i];
        	if(ans<next) ans=next;
        }
        
        System.out.println(ans);
    }
}