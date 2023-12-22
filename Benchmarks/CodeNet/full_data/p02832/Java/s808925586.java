import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] A = new int[N];
        int count=0;
        int num=1;
        for (int i=0; i<N; i++){
            A[i]=sc.nextInt();
            if(A[i]==num){
                num++;
            }else{
                count++;
            }
        }
        if(count>=N){
            count=-1;
        }
        System.out.println(count);

    }
}
