import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int j;
        for(int i=0;i<n;i++){
            A[i]=0;
        }
        for(int i=1;i<n;i++){
            j = sc.nextInt()-1;
            A[j]++;
        }
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
    }
}