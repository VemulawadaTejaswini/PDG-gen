import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n =  stdIn.nextInt();
        int[] a = new int[n];
        double sumW = 0;
        double sumS = 1;
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            sumS *= a[i];
        }
        for(int i = 0; i < n; i++){
            sumW += sumS/a[i] ;
        }
        System.out.println(sumS/sumW);
    }
}