import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[M];

        int count = 0;
        int count2 = 0;
        for(int i = 0;i<M;i++){
            A[i] = sc.nextInt();
            if(A[i]<X){
                count += 1;
            }
            else if(A[i]>X){
                count2 += 1;
            }
        }
        System.out.println(Math.min(count,count2));
    }
}