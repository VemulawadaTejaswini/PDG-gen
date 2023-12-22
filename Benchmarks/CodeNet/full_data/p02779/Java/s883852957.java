import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        boolean test = true;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<N-1; i++){
            if(a[i] == a[i+1]){
                test = false;
            }
        }
        if(test){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}