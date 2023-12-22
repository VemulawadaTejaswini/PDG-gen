import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int M=sc.nextInt();

        int[] list=new int[N];
        for(int i=0;i<M;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            list[a]++;
            list[b]++;
        }

        Arrays.sort(list);
        for(int i=0;i<N;i++){
            if(list[i]%2==1){
                System.out.println("No");
                return;
            }
        }
        if(list[N-1]>5){
            System.out.println("Yes");
            return;

        }
        if(list[N-1]>3&&list[N-2]>3){
            System.out.println("Yes");
            return;

        }
        System.out.println("No");
        return;


    }
}