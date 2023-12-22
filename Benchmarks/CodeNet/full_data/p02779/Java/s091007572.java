import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, N, T=0;
        int A[] =new int[1000000000];
        N = scan.nextInt();
        for(i=0; i<N; i++){
            A[i] = scan.nextInt();
        }
        for(i=0; i<N-1; i++){
            for(j=i+1; j<N; j++){
                if(A[i]==A[j]){
                    T++;
                }
            }
        }
        if(T==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}