import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N  =sc.nextInt();
        int [] list = new int[N];
        for(int i=1;i<=N;i++){
            int num = sc.nextInt();
            list[num-1]=i;
        }
        for(int i=0;i<N;i++) System.out.print(list[i]+" ");
        System.out.println();
    }
}
