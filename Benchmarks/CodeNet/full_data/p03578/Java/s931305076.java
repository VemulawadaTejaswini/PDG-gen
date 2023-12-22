import java.util.Scanner;


public class Main{

    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int[] D = new int[N];
       for(int i=0; i<N; i++){
        D[i] = scan.nextInt();
    }
    int M = scan.nextInt();
       int[] T = new int[M];
       for(int i=0; i<M; i++){
        T[i] = scan.nextInt();
    }

    int count = 0;

    for (int i=0; i<M; i++){
        for(int j=0; j<N; j++){
            if(D[j] == T[i]){
                D[j] = 0;
                count += 1;
                break;
            }
        }
    }
    if(count == M){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
   
       scan.close();
    }
}