import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[3*N] ;
        for(int i=0;i<3*N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long result=0;
        for(int i=3*N;i>N;i--){
            result+=a[i-2];
            i--;
        }
        System.out.println(result);
    }

}