import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int V = scan.nextInt();
        int P = scan.nextInt();
        int ans = 0;
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            int k = scan.nextInt();
            num[i]=k;
        }

        Arrays.sort(num);

        int bor = num[num.length-1];
        int cou = 0;
        int bor_num=0;
        boolean flg = false;
        for(int i=N-1;0<=i;i--){
            if(cou==P){flg=true;}
            if(num[i]<bor){
                if(flg)break;
                bor=num[i];
                bor_num=1;
            }else{
                cou++;
                bor_num++;
            }
        }

        int mi = M-(N-V);
        if(mi<0){
            mi = 0;
        }else{
            if((N-V)<bor_num){
                mi++;
            }
        }

        for(int i=0;i<N;i++){
            if(num[i]+M>=num[N-P]+mi){
                ans++;
            }
        }


        System.out.println(ans);
    }
}
