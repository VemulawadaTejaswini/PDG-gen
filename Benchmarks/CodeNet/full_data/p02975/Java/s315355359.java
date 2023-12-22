import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(a.length%3!=0){
            System.out.println("No");
            return;
        }

        if(a[0]==a[N/3-1]&&a[N/3]==a[N/3*2-1]&&a[N/3*2]==a[N-1]){
            if((a[0]^a[N/3])==a[N/3*2]){
                System.out.println("Yes");
                return;

            }
            System.out.println("No");
            return;

        }else{
            System.out.println("No");
            return;

        }


    }
}
