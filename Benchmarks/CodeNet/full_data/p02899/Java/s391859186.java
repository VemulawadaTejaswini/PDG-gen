import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
            for(int i = 1; i <= N; i++){
                for(int j = 0; j< N; j++){
            if(A[j] == i){
                int x = j+1;
System.out.print(x + " ");
break;
            }
        }
        }
}
}
