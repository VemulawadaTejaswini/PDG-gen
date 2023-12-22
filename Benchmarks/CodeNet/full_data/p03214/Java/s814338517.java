import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int a = 0;
    	int[] ary = new int[N];
    	double sum = 0;
    	for(int i = 0; i < N; i++){
    		ary[i] = sc.nextInt();
    		sum += ary[i];
    	}
    	double average = sum / (double)N;
    	double num = 100;
    	for(int i = N-1; i >= 0; i--){
    		double n = Math.abs((double)ary[i] - average);
    		if(n < num || n == num){
    			a = i;
    			num = n;
    		}
    	}

        System.out.println(a);
    }
}