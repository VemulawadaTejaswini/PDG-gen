import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        final int elementMax = 100000;
        int[] amount = new int[elementMax+1];
        for(int n=0;n<N;n++){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	amount[a]+=b;
        }
        
        int checked = 0;
        for(int i=0;i<=elementMax;i++){
        	checked += amount[i];
        	if(checked>=K){
        		System.out.println(i);
        		break;
        	}
        }
    }
}