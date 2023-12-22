import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    static int K;

    static void dec(List<Integer> list, int digit){
        int pos = list.size()-1-digit;
        if(list.get(pos)==0){
            if(list.get(pos-1)>1)list.set(pos, K);
            dec(list, digit+1);
        }else{
            list.set(pos, list.get(pos)-1);
        }
    }

    static int cnt=0;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();
        int N =scan.nextInt();
        List<Integer> ans = new ArrayList<>();
        if(K%2==0){
            ans.add(K/2);
            while(N-->1)ans.add(K);
        }else{
            for(int i=0;i<N;++i)ans.add((K+1)/2);
            cnt = N/2;
            for(int i=0;i<cnt;++i){
                dec(ans, 0);
                // for(int j : ans)System.out.print(j+" ");
                // System.out.println();
            }
        }
        for(int i : ans)if(i!=0)System.out.print(i+" ");
        System.out.println();
    }
}