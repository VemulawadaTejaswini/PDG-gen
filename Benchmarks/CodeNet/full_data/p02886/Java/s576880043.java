import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int n=0; n<N; n++) d[n]=sc.nextInt();

        long hp = 0;
        for(int m=0; m<N; m++) for(int n=m+1; n<N; n++) hp += d[m]*d[n];
        System.out.println(hp);
    }
}
