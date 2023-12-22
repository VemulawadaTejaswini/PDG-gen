import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer a[] = new Integer[N];
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        
        int A = 0;
        int B = 0;
        for(int i=0; i<N; i+=2){
            A += a[i];
        }
        for(int i=1; i<N; i+=2){
            B += a[i];
        }
        System.out.println(A-B);
    }
}
