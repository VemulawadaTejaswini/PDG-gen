import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] A = new double[N];
        double sum1 = 0;


        
        for(int i = 0; i < N; i++) {
        	A[i] = sc.nextDouble();
        }
        
        for(int i = 0; i < A.length; i++) {
        	sum1 += 1/A[i];
        }
        
System.out.println(1/sum1);
        
        sc.close();
    }
}
