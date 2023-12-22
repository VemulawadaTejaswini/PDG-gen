import java.io.IOException;
import java.util.*;

public class Main {
    public static int map[]=new int[20001];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A=sc.nextInt()*N;
        int B=sc.nextInt();
        int ans=Math.min(A,B);
        System.out.println(ans);

    }


}