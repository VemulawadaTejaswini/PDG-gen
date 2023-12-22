import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int[] A =new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        int k = 1;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                // 出席番号kを探す
                if(A[j]==k){
                    System.out.println(j+1);
                    break;
                }
            }
            k=k+1;
        }


    }
}