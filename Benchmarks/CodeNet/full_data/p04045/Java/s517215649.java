import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] D=new int[K];
        for(int i=0; i<K; i++){
            D[i]=sc.nextInt();
        }

        for(int i=0; i<=100000; i++){
            if(kakunin(i,D)){
                if(i >= N){
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
    }
    public static boolean kakunin(int i,int[] D){
        while(i>0){
            int am=i%10;
            for(int j=0; j<D.length; j++){
                if(am == D[j]){
                    return false;
                }
            }
            i/=10;
        }
        return true;
    }
}
