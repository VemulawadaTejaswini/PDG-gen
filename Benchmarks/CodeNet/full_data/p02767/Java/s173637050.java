import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X[] = new int[N];
        
        for(int i = 0; i < N; i++){
        	X[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i <= 100; i++){
        	int sum = 0;
            for(int j = 0; j < N; j++){
            	sum += Math.pow((i - X[j]), 2);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}