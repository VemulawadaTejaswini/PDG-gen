import java.util.*;

public class Main {

    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long result = 0;
        int N=sc.nextInt();

        long[] a=new long[3*N];

        for(int i=0;i<3*N;i++){
            a[i]=sc.nextLong();

        }

        Arrays.sort(a);

        for(int i=N;i<2*N;i++){
            result+=a[i];
        }

        System.out.println(result);


    }
}
