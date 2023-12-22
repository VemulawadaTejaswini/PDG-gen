import java.util.*;
 
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]A = new int[N];
    
    double all = 0;
    for(int i=0; i<N; i++){
    A[i] = sc.nextInt();
    all += (double)1/A[i];
    }
        System.out.println(1/all);
}
}