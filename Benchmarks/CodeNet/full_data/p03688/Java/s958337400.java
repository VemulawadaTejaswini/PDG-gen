import java.util.*;

public class Main {
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(a[a.length-1]-a[0]>1){
            System.out.println("NO");
        }
        if(a[a.length-1]-a[0]==0){
            int colorNum=a[a.length-1];
            if(colorNum==N-1){
                System.out.println("YES");
                return;
            }
            if(colorNum*2<=N){
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;


        }else{
            int colorNum=a[a.length-1];
            for(int i=1;i<=colorNum&&i+colorNum<=N;i++) {
                if(N - colorNum -i<0){
                }
                else if (a[N - colorNum-i] == colorNum-1 && a[N - colorNum -i+1] == colorNum ) {
                    System.out.println("YES");
                    return;
                }
            }

            System.out.println("NO");
            return;
        }
    }
}
