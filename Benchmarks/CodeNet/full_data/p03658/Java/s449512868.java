import java.util.*;



public class Main {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int t=sc.nextInt();
        int l[] = new int[N];

        for(int i=0; i<N; i++)
        {
            l[i]=sc.nextInt();
        }
       Arrays.sort(l);
        int result=0;
        for(int i=0; i<t; i++)
        {
            result+=l[N-1-i];
        }
        System.out.println(result);
    }


}

